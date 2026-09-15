import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int amt= scanner.nextInt();
        int[] nums= new int[amt];

        for(int i=0; i<amt; i++) nums[i]=scanner.nextInt();
        
        int sum=0;
        for(int current:nums) sum+=current;

        System.out.println(sum); 
    }
}
