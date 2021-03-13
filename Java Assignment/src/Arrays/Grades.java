package Arrays;

/** Write a program that allows user to enter number of grades(out off 100)
 and provide them with their average, highest & lowest score
 Example: Number of grades : 4 User enters: 50, 78, 69,55 Average : 63
 Highest: 78
 Lowest : 50
 **/

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputGrades=0;
        int[] grades;
        int highestGrade=0;
        int lowestGrade=0;
        int avgGrade;
        int sumGrade=0;
        boolean flag = true;

        while(flag == true) {
            System.out.println("Enter the number of grades: ");
            inputGrades = s.nextInt();

            if (inputGrades < 1) {
                System.out.println("Enter a valid number of grades (> 0)!");
            }
            else {
                flag = false;
            }

        }

        grades = new int[inputGrades];

        for(int i=0; i<inputGrades; i++) {
            System.out.println("Grade " + (i + 1) +": ");
            grades[i] = s.nextInt();
            if (i == 0) {
                highestGrade = grades[i];
                lowestGrade = grades[i];
                sumGrade = grades[i];
            }
            else {
                if(grades[i] > highestGrade) {
                    highestGrade = grades[i];
                }
                if(grades[i] < lowestGrade) {
                    lowestGrade = grades[i];
                }
                sumGrade = sumGrade + grades[i];
            }
        }
        avgGrade = (sumGrade / inputGrades);
        System.out.println("Average: " + avgGrade);
        System.out.println("Highest: " + highestGrade);
        System.out.println("Lowest: " + lowestGrade);
    }

}