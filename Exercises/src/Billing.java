import com.sun.org.apache.xalan.internal.xsltc.trax.TrAXFilter;

/**
 * Created by rylan on 27/08/2016.
 */
import java.util.Scanner;
public class Billing {

    final static double TAX = 0.08;

    public static void main(String[] args) {
        double bill;
        bill = computeBill(30.25);
        System.out.println("The total for a photobook that costs $30.25 is $" + bill);

        bill = computeBill(30.25, 3);
        System.out.println("The total for the two photobooks that costs $30.25 is $" + bill);

        bill = computeBill(30.25, 6, 30);
        System.out.println("The total for the six photobooks that costs $30.25 with a $30 coupon is $" + bill);
    }

    public static double computeBill(double amount) {
        double bill = (amount + amount * TAX);
        return bill;
    }

    public static double computeBill(double amount, int quantity) {
        double bill = (amount * quantity);
        bill = (bill + bill * TAX);
        return bill;
    }

    public static double computeBill(double amount, int quantity, int coupon) {
        double bill = (amount * quantity);
        bill = bill - coupon;
        bill = (bill + bill * TAX);
        return bill;
    }

}