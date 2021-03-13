package InputByUser;

/** 2.Take two integer inputs from user.First calculate the sum of two then product of two.
 Finally, print the sum and product of both obtained results.**/

import java.util.Scanner;

public class SumAndProduct2 {

        public static void main(String[] args){

            Scanner s= new Scanner(System.in);

            //1st input from user

            System.out.println("Enter the 1st number");
            int num1= s.nextInt();

            //2nd input from user

            System.out.println("Enter the second number");
            int num2= s.nextInt();

            //The sum of two numbers
            System.out.println("The sum of two number's is "+(num1+num2));

            //The product of two numbers
            System.out.println("The product of two number's is "+(num1*num2));

            //The sum of both obtained results.
            System.out.println("Sum of the obtained results is "+((num1+num2)+(num1*num2)));

            //The product of both obtained results.
            System.out.println("Product of of the obtained results is "+((num1+num2)*(num1*num2)));
        }
    }

