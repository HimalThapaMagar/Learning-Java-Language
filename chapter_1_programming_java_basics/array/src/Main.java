import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int array[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter " + (i+1) + "th number");
            array[i] = sc.nextInt();
        }
        System.out.println("Printing array");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}