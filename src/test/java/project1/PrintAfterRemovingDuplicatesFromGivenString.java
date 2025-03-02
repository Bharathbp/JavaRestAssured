package project1;

import java.util.Scanner;

public class PrintAfterRemovingDuplicatesFromGivenString {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner scanner = new Scanner(System.in);
        String inputstr = scanner.nextLine();
        System.out.println("Entered String is --> "+inputstr);
        
        StringBuilder newstr = new StringBuilder();
        for(int i = 0; i<=inputstr.length() ; i++){
            char ch = inputstr.charAt(i);
            for (int j=1; j<=inputstr.length() ; j++){
                if(ch != inputstr.charAt(j)){
                    StringBuilder append = newstr.append(ch);
                }
            }
        }
    }
}
