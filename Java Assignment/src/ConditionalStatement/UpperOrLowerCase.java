package ConditionalStatement;

//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).

import java.util.Scanner;

public class UpperOrLowerCase {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the char");
        char character = s.next().charAt(0);
        if(character>='a' && character<='z')
        {
            System.out.println("Lowercase");
        }
        else if(character>='A' && character<='Z')
        {
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Enter a valid character");
        }
    }
}
