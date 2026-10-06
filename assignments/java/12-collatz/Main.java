import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int n=scanner.nextInt();
        IO.print(n);
        while(n!=1){
        
        if(n%2==0) n/=2;
        else n=3*n+1;
        IO.print(" "+n);
        }
    }
}
