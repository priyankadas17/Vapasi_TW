package ConditionalStatement;

import java.util.Scanner;

/**
 Modify the above question(no.8) to allow student to sit if he/she has medical cause.
 Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 **/

public class StudentMedicalCause {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of class held");
        double held = s.nextDouble();
        System.out.println("Enter number of classes attended (should be less than classes held)");
        double attended = s.nextDouble();
        System.out.println("Do you have any medical issue?");
        String cause = s.next();

        //Calculate the percentage of classes attended

        double percentage = (attended/held) * 100;
        System.out.println("The percentage of class attended is "+(int)percentage+"%");

        if(percentage<75 && cause.equals("N")){
            System.out.println("Not allowed to sit in exam");

        }
        else if(percentage<75 && cause.equals("Y")){
            System.out.println("Allowed to sit in exam");

    }
        else
        System.out.println("Allowed to sit in exam");
}}
