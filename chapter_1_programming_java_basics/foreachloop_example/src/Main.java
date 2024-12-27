import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The elements in array:");
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}