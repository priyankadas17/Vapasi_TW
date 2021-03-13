package InputByUser;

//3.Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.


import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){

    Scanner s = new Scanner(System.in);

       //First double input from the user
        System.out.println("Enter the first double input");
        double length = s.nextDouble();

       //Second double input from user
        System.out.println("Enter the second double input");
        double  breadth = s.nextDouble();

        //Area of Rectangle type casted to int
        int Area= (int)(length*breadth);
        System.out.println("The area of Rectangle type casted to int is "+Area);
}
}
