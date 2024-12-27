public class Main {
    static int divide(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
        try{
            divide(1,0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block");
        }
    }
}