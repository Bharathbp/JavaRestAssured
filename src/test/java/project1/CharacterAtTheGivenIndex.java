package project1;

import java.util.Scanner;

public class CharacterAtTheGivenIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Name");
        String name = scanner.nextLine();
        int length = name.length();
        System.out.println("Enter the Charecter");
        int muber = scanner.nextInt();
        if(length>muber){
            for (int i=0; i<=length;i++){
            if (i==muber){
                System.out.println("Character at Index --> " + i + " is "+name.charAt(i) );
                }

            }
        } else  {
            System.out.println("Enter the valid number below --> "+length);
        }


        }

}
