package ConditionalStatement;

/** A student will not be allowed to sit in exam if his/her attendance is less than 75%.
 Take following input from user Number of classes held Number of classes attended. And print
 percentage of class attended

 Is student is allowed to sit in exam or not. **/

import java.util.Scanner;

public class StudentExam {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of class held");
        double held = s.nextDouble();
        System.out.println("Enter number of classes attended (should be less than classes held)");
        double attended = s.nextDouble();

        //Calculate the percentage of classes attended

        double percentage = (attended/held) * 100;
        System.out.println("The percentage of class attended is "+(int)percentage+"%");

        if(percentage<75){
            System.out.println("Not allowed to sit in exam");
        }
        else
            System.out.println("Allowed to sit in exam");

    }
}
