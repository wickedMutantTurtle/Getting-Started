import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int[] num = new int[2];
        for(int i=0; i<num.length; i++) num[i]=scanner.nextInt();

        
        IO.println(num[0]%num[1]);
    }
}
