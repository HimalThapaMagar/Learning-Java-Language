import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("WHat is your name?");
        String name = scanner.nextLine();
        System.out.println("Choose a number between 1-5.");
        Integer number = scanner.nextInt();

        scanner.nextLine();
        // this is used here to clear out the \n escape character from the scanner object I think.

        System.out.println("WHat is your favorite color?");
        String color = scanner.nextLine();

        System.out.println("SO nice to meet you, "+name);
        System.out.println(number);
        System.out.println(color);

    }
}