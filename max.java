import java.util.Scanner;
public class max {
    
    
    public static void main(String[] args) {
        int nums[]={5,12,8,20,3};
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        //Scanner sc = new Scanner(System.in);
        // int num=sc.nextInt();
          System.out.println(" Max number is "+ max);
          System.out.println("MIn number is "+ min);
    }
    
}
