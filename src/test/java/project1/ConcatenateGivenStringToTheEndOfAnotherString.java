package project1;

import java.util.Scanner;

public class ConcatenateGivenStringToTheEndOfAnotherString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First String");

        String firstinput = scanner.nextLine();

        System.out.println("Enter Second String");

        String seconinput = scanner.nextLine();

        System.out.println(firstinput+ " & " + seconinput);

    }
}
