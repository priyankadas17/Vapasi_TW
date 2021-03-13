package Arrays;

/**
  Write a program to print random & unique car digit number
 ● Take input from user for number of unique car number to generate
 ● Take format of card number to be MH{Random4digits}: MH3459
 ● Make sure number generated are not duplicate
 **/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomCarDigit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] rStr;
        String tStr = new String("");
        int num = 0;
        int randomCarNumber = 0;
        Random random = new Random();
        boolean cVar = true;

        System.out.println("Enter the number of unique car no's to be generated ");
        num = s.nextInt();
        rStr = new String[num];

        for (int i = 0; i<num; i++) {
            while(cVar) {
                randomCarNumber = random.nextInt(9999);
                if (randomCarNumber < 1000) {
                    tStr = String.format("%04d", randomCarNumber);
                } else {
                    tStr = String.valueOf(randomCarNumber);
                }
                cVar = Arrays.asList(rStr).contains(tStr);
                if(!cVar) {
                    rStr[i] = tStr;
                    System.out.println((i + 1) + " : MH" + rStr[i]);
                }
            }
            cVar = true;
        }

    }

}










