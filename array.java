import java.util.*;
public class array {
    


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[3][3];
        int sum=0;
        System.out.println("Enter your 9 number");
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            sum+=matrix[i][i];
        }

        System.out.println("Diagonal elements sum is:"+sum);
}
}