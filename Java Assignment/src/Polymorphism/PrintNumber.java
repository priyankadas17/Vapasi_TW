/**Create a class named 'PrintNumber' to print various numbers of different datatypes
 by creating different methods with the same name 'println' having a parameter for each data type**/

package Polymorphism;

public class PrintNumber {

public void println(int num1) {
    System.out.println("The integer value = " + num1);
}

    public void println(double dub) {
        System.out.println("The double value is " + dub);
    }
        public void println(float flo) {
            System.out.println("The float value is " + flo);
        }
 public static void main(String[] args) {
     PrintNumber num = new PrintNumber();
     num.println(1000);
     num.println(100.10);
     num.println(100.50f);
 }

}
