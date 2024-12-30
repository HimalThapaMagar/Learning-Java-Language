import java.util.Scanner;

// Define a custom exception
class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message); // Pass the message to the parent Exception class
    }
}

// Define a class to handle age-related logic
class AgeChecker {
    public void tryAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Age below 18 is not allowed.");
        } else {
            System.out.println("You got a free beer, yay!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        AgeChecker ageChecker = new AgeChecker();

        try {
            ageChecker.tryAge(age);
        } catch (AgeRestrictionException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
