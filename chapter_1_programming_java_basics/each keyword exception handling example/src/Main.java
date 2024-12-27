import java.util.Scanner;

public class Main {
    static void ExceptionMethod(int age) throws Exception{
        if(age < 18){
            throw new Exception();
        }
        else{
            System.out.println(age);
        }
        return;
    }

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = sc.nextInt();
        try{
            ExceptionMethod(age);
        }catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Goodbye!");
            sc.close();
        }
    }
}