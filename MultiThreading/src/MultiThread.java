// this is one of the way that is well easy to say at the very least than the other one.

// public class MultiThread extends Thread {
//    public void run(){
//        System.out.println("A thread is running.");
//    }
//    public static void main(String[] args) {
//        MultiThread mt = new MultiThread();
//        mt.start();
//    }
// }

//Now by another method of creating threads.
public class MultiThread implements Runnable {
    public void run(){
        System.out.println("A new thread is running......");
    }
    public static void main(String[] args) {
        MultiThread mt = new MultiThread();
        Thread t = new Thread(mt);
        t.start();
    }
}