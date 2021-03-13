package ConditionalStatement;

import java.util.Scanner;

public class SquareOrNot {

//Take values of length and breadth of a rectangle from user and check if it is square or not.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int length = s.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth = s.nextInt();
        if (length==breadth) {
            System.out.println("It is a square");
        }
        else {
            System.out.println("It is not a square");
        }

    }}
