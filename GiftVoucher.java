import java.util.Scanner;
public class GiftVoucher {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double voucherAmount;
    double itemPrice;
    double balance;
    double totalSpent = 0;

    System.out.print("Enter voucher amount: ");
    voucherAmount = input.nextDouble();

    balance = voucherAmount;

    while (balance > 0) {

        System.out.print("Enter item price: ");
        itemPrice = input.nextDouble();

        if (itemPrice <= 0) {
            break;
        }

        if (itemPrice <= balance) {
            balance = balance - itemPrice;
            totalSpent = totalSpent + itemPrice;

            System.out.println("Item purchased successfully");
            System.out.println("Total spent: " + totalSpent);
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Exceeds voucher balance");
            System.out.println("Remaining balance: " + balance);
        }
    }

    System.out.println("Final total spent: " + totalSpent);
    System.out.println("Final remaining balance: " + balance);
}
}