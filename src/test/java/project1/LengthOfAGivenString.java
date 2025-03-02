package project1;

import java.util.Scanner;

public class LengthOfAGivenString {
    public static void main(String[] args) {
        System.out.println("Enter the String Input");
        Scanner scanner = new Scanner(System.in);
       String inputstring = scanner.nextLine();
        int length = inputstring.length();
        System.out.println("the length of " + inputstring + "  is  "+length);
    }
}
