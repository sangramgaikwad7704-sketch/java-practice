import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0){
            System.out.println("positive");
        }
        else if (number<0){
            System.out.println("negative");
            
        } else {
            System.out.println("zero");

        // } else {
        //     System.out.println("non-integer");
        // }
        

        // Place your code here


        sc.close();
    }
}
}