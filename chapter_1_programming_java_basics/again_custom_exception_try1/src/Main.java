import java.util.Scanner;

public class Main {
    static class AgeException extends Exception {
        public AgeException(String message) {
            super(message);
        }
    }
    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Invalid age");
        }
        else {
            System.out.println("Age is valid");
        }
    }
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = sc.nextInt();
        try{
            validateAge(age);
        }catch(AgeException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Goodbye!");
            sc.close();
        }
    }
}