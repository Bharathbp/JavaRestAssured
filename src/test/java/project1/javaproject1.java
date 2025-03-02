package project1;

import java.util.Scanner;

public class javaproject1 {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number till need to print -->");
        int num = scanner.nextInt();
        System.out.println("Enterd number "+ num);
        for (int i=0; i<=num; i++){
            int loc = i;
            if (loc % 3 == 0){
             System.out.println(loc + "  Fizz");
            } else if (loc % 5 == 0) {
                System.out.println(loc + "  Buzz");
            }
            else if (loc % 3 == 0 && loc % 5 == 0) {
                System.out.println(loc + "  FizzBuzz");
            }
            else if (loc % 3 != 0 && loc % 5 != 0) {
                System.out.println(loc);
            }

        }
    }

}
