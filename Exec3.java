import java.util.*;

public class Exec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your index");
        int[] arr = { 10, 20, 30, 40, 50 };
        int index = sc.nextInt();

        try {

            System.out.println("Your index element is:" + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index number not found");
        } finally {
            System.out.println("Code completed");
        }
    }
}
