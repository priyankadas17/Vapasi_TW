package ConditionalStatement;

//Take two int values from user and print greatest among them.

import java.util.Scanner;

public class GreatestOfTwoNos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st int value");
        int num1 = s.nextInt();
        System.out.println("Enter the 2nd int value");
        int num2 = s.nextInt();
        if(num1>num2) {
            System.out.println("1st int value is greater");
        }
        else {
            System.out.println("2nd int value is greater");
        }


    }

}