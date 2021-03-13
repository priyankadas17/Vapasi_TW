package ConditionalStatement;

import java.util.Scanner;

/**  Write a program to print absolute value of a number entered by user. E.g.-
 INPUT: 1 OUTPUT: 1
 INPUT: -1 OUTPUT: 1  **/

public class AbsoluteValue {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();

        //Calculate and print the absolute value
        System.out.println("The absolute value of the no is "+(Math.abs(num)));
    }

}
