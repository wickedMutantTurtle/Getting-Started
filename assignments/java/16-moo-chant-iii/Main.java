import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        ArrayList<String> Chant= new ArrayList<>();
        

        while (scanner.hasNext()) {
        Chant.add(scanner.next()); 
        }

        for(String current:Chant){
            IO.println(current);
        }
    }
}
