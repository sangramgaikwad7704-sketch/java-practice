import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // int a =10;
        // int b = 25;
        // int c = 45;

        if (a > b) {
            System.out.println("a is greatest");
        }

        else if (b > c&& a >c) {
        System.out.println("b is greatest");
        }

        else {
        System.out.println("c is greateast"); 
        }
        
    }
    

}