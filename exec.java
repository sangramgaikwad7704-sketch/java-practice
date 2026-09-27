import java.util.*;
class Exec{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your a and b");
         int a=sc.nextInt();
         int b=sc.nextInt();
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Calculation completed");
        }
    }

}