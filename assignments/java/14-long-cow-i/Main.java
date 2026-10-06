import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        String Ncow= scanner.nextLine();
        String Jcow= scanner.nextLine();
        if(Ncow.length()>Jcow.length())IO.println("nohj");
        else if(Ncow.length()<Jcow.length()) IO.println("john");
        else IO.println("-1");
    }
}
