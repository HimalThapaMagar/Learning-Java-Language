import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scan.nextInt();

            try{
                checkAge(age);
            }
            catch(Exception e)
            {
                System.out.println("A problem occured: "+e);
            }
        }

        static void checkAge(int age)throws AgeException{

            if(age<18) {
                throw new AgeException("\n"+"You must be 18+ to get a beer");
            }
            else {
                System.out.println("Congratulations you got a free beer!!!!");
            }
    }
}