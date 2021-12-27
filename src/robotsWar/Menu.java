package robotsWar;

import java.util.Scanner;

public class Menu {
    public static String readInput(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        }catch (Exception e){
            return "0";
        }
    }
    public static String readInput(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        }catch (Exception e){
            return "0";
        }
    }
}
