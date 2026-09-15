import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int amt= scanner.nextInt();
        int[] uwu = new int[amt];
        for (int i=0; i<amt;i++) uwu[i] = scanner.nextInt();
        for (int i = amt-1; i >= 0; i--) System.out.print(uwu[i] + " ");
    }
}
