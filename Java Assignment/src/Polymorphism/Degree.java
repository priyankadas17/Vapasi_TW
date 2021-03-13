/** Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
   It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name
   that prints "I am an Undergraduate" and "I am a Postgraduate" respectively.
   Call the method by creating an object of each of the three classes**/

package Polymorphism;

    public class Degree {
    public void getDegree(){
        System.out.println("I got a degree");
    }
    }
       class Undergraduate extends Degree{
        public void getDegree(){
            System.out.println("I am an undergraduate");
        }
    }

        class Postgraduate extends Degree{
            public void getDegree(){
                System.out.println("I am a postgraduate");
            }
    }
        class Main{
        public static void main(String[]args){
            Degree d=new Degree();
            d.getDegree();
            Undergraduate ug=new Undergraduate();
            ug.getDegree();
            Postgraduate pg=new Postgraduate();
            pg.getDegree();
        }
        }


