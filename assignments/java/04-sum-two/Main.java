import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int[] nums= new int[2];

        for(int i=0; i<2; i++) nums[i]= scanner.nextInt();

        System.out.println(nums[0]+nums[1]);
    }
}
