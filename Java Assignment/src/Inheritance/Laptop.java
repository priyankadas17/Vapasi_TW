package Inheritance;

public class Laptop {
    final String Name;
    final String Price;
    final String Processor;
    final String Ram;
    final String HDD;

    public Laptop(String Name,String Price,String Processor,String Ram,String HDD){
        this.Name=Name;
        this.Price=Price;
        this.Processor=Processor;
        this.Ram=Ram;
        this.HDD=HDD;
    }

}

class LaptopDetails extends Laptop{

    public LaptopDetails(String Name, String Price, String Processor, String Ram, String HDD){
        super(Name,Price,Processor,Ram,HDD);
    }
    public static void main(String[] args){
        Laptop l1=new Laptop("Lenovo", "$1000", "i3","2GB","500GB");
        System.out.println("Name : "+l1.Name+ "\nPrice : "+l1.Price+ "\nProcessor : "+l1.Processor+"\nRam : "+l1.Ram+"\nHDD : "+l1.HDD);
        System.out.println("***********************************");

        Laptop l2=new Laptop("Dell", "$1500", "i5","4GB","1TB");
        System.out.println("Name : "+l2.Name+"\nPrice : "+l2.Price+"\nProcessor : "+l2.Processor+"\nRam : "+l2.Ram+"\nHDD : "+l2.HDD);
        System.out.println("***********************************");

        Laptop l3=new Laptop("Sony", "$2000", "i9","8GB","1TB");
        System.out.println("Name : "+l3.Name+"\nPrice : "+l3.Price+"\nProcessor : "+l3.Processor+"\nRam : "+l3.Ram+"\nHDD : "+l3.HDD);
        System.out.println("***********************************");

    }
}

