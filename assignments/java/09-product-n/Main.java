import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int amt= scanner.nextInt();
        long[] num= new long[amt];
        for(int i=0; i<amt; i++) num[i]=scanner.nextLong();

        long mod=num[0];

        for(int i=0; i<amt-1; i++) {
            long current=(mod*num[i+1])%1000000007; 
            mod=current;
        }
        IO.println(mod);
    }
}
