package project1;

import java.util.Scanner;

public class ProgramToReplaceASpecifiedCharacterWithAnotherCharacter {

    public static void main(String[] args) {
System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String inputstr = scanner.nextLine();
        System.out.println("Entered String --> " + inputstr);
        String replace = inputstr.replace(" ", "--");
        System.out.println("New String with replace --> " + replace);

    }
}
