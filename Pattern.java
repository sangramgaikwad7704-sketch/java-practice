import java.util.*;

class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int i = sc.nextInt();

        System.out.print("Enter columns: ");
        int j = sc.nextInt();

        for (int row = 0; row < i; row++) {

            for (int col = 0; col < j; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}