import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int amt= scanner.nextInt();
        String[] cowNoise= new String[amt];

        for(int i=0; i<amt; i++) cowNoise[i]=scanner.nextLine();

        int WinL= 0;
        String WinN= "";

        for(int i=0; i<amt; i++){
            if(cowNoise[i].length()>WinL) 
                {WinL= cowNoise[i].length(); 
                WinN= cowNoise[i];}
        }

        IO.println(WinL);
        IO.println(WinN);
        
    }
}
