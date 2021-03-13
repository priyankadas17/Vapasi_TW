package ConditionalStatement;

//Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;

public class OldestAmong3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age of first person");
        int age1 = s.nextInt();
        System.out.println("Enter the age of second person");
        int age2 = s.nextInt();
        System.out.println("Enter the age of third person");
        int age3 = s.nextInt();

        if(age1>age2 && age1>age3){
            System.out.println("The first person is oldest");
        }
        else if(age2>age1 && age2>age3){
            System.out.println("The second person is oldest");
        }
        else
        {
            System.out.println("The third person is oldest");
        }
        if(age1<age2 && age1<age3){
            System.out.println("The first person is youngest");
        }
        else if(age2<age1 && age2<age3){
            System.out.println("The second person is youngest");
        }
        else
        {
            System.out.println("The third person is youngest");
    }
}}
