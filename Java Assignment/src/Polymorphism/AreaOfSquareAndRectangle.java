/** Create a class to print the area of a square and a rectangle.
    The class has two methods with the same name but different number of parameters.
    The method for printing area of rectangle has two parameters which are length and breadth respectively
   while the other method for printing area of square has one parameter which is side of square.**/

package Polymorphism;

    public class AreaOfSquareAndRectangle {
    public void Area(int length, int breadth){
        System.out.println("The area of Rectangle is "+(length*breadth));
    }
    public void Area(int side){
        System.out.println("The area of Square is "+(side*side));
    }
    public static void main(String[]args){
        AreaOfSquareAndRectangle area=new AreaOfSquareAndRectangle();
        area.Area(5,5);
        area.Area(10);
    }
}
