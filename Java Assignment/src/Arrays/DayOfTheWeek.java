package Arrays;

import java.util.Scanner;

/** Day of the Week
 1. Make array that holds textual value of days like “Monday, Tuesday etc
 2. Let use input corresponding day
 3. Program should output String that represent day and you can assume week start Monday
 Example: User input 1:
 Output: Monday **/


public class DayOfTheWeek {

    public static void main(String[] args) {
        boolean flag = true;
        int day = 0;
        Scanner s = new Scanner(System.in);

        while (flag == true) {
            System.out.printf("Enter a day between 1 to 7 : ");
            day = s.nextInt();

            if(day < 1 || day > 7) {
                System.out.println("Please try again!");
            }
            else {
                flag = false;
            }
        }

        String Week[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (day <= 7) {
            System.out.println("The day is " + Week[day - 1]);
        } else {
            System.out.println("Please enter a day between 1 to 7");
        }
    }
}