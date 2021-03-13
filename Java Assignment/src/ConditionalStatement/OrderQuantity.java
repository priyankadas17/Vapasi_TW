package ConditionalStatement;

/**A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
 Ask user for quantity
 Suppose, one unit will cost 100.
 Judge and print total cost for user.**/


import java.util.Scanner;

public class OrderQuantity {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the quantity");
        int quantity = s.nextInt();

        //Calculate total cost of purchase quantity

        int TotalPurchaseQuantity = 100 * quantity;

        //Calculate the discount on total purchase quantity
        int disc = (int) (TotalPurchaseQuantity * (0.1));


        if (TotalPurchaseQuantity > 1000) {
            System.out.println("Total cost of the user is " + (TotalPurchaseQuantity - disc));
        } else {
            System.out.println("Total cost of the user is " + TotalPurchaseQuantity);
        }
    }
}

