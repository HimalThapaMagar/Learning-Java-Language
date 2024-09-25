public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        int x = 1;
        int y = 2;

        System.out.println("The value of x is "+x+" and y is "+y);
        System.out.println("Swapping values....");
        int z = x;
        x= y;
        y = z;
        System.out.println("The value of x is "+x+" and y is "+y);
    }
}