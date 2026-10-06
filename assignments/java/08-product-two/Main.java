import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        long[] num= new long[2];
        for(int i=0; i<num.length; i++) num[i]=scanner.nextLong();

        long answer=(num[0]*num[1])%1000000007L;
        IO.println(answer);
    }
}
