package ConditionalStatement;

import java.util.Scanner;

/**A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
        Ask user for their salary and year of service and print the net bonus amount.**/

public class EmployeeService {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Salary");
        double salary = s.nextDouble();
        System.out.println("Enter year of Service");
        int yos = s.nextInt();

        if (yos>5){
            System.out.println("The net bonus amount is "+(0.05*salary));
        }
        else{
            System.out.println("No bonus");
        }
    }
}
