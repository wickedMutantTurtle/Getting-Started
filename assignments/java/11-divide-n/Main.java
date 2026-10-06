import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int amt= scanner.nextInt();
        int[] num= new int[amt];
        for(int i=0; i<amt; i++) num[i]=scanner.nextInt();

        int answ=num[0];

        for(int i=0; i<amt-1; i++){
            int current= answ/num[i+1];
            answ=current;
        }
        IO.println(answ);
    }
}
