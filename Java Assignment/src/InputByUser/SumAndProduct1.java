package InputByUser;

//1.Write a program to take two integer inputs from user and print sum and product of them.

import java.util.Scanner;

public class SumAndProduct1 {

    public static void main(String[] args){

        Scanner s= new Scanner(System.in);

        //1st input from user

        System.out.println("Enter the 1st number");
        int num1= s.nextInt();

        //2nd input from user

        System.out.println("Enter the second number");
        int num2= s.nextInt();

        //Find the sum
        System.out.println("The sum of two number's is "+(num1+num2));

        //Find the product
        System.out.println("The product of two number's is "+(num1*num2));
    }
}
