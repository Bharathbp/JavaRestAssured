package project1;

import java.util.Scanner;

public class GivenStringContainsTheSpecifiedSequenceOfCharValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string compare");
        String firststring = scanner.nextLine();
        System.out.println("Enter Second string to compare");
        String secondstring = scanner.nextLine();
        if(firststring.contains(secondstring)){

//            System.out.println(Boolean);
            System.out.println("The string contains \"" + secondstring + "\".");
        }else {
            System.out.println("The string does not contain \"" + secondstring + "\".");
        }

    }
}
