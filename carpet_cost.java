import java.util.Scanner;

public class carpet_cost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        double length;     
        double breadth;      
        double pricePerSqFt; 
        double discountPercent; 
        
        System.out.println("Enter the length of the carpet in inches:");
        length = scanner.nextLong();
        System.out.println("Enter the breadth of the carpet in inches:");
        breadth = scanner.nextLong();
        System.out.println("Enter the price per square foot:");
        pricePerSqFt = scanner.nextLong();
        System.out.println("Enter the discount percentage:");
        discountPercent = scanner.nextLong();

        double areaSqFt = (length * breadth) / 144;

        
        double priceBeforeDiscount = areaSqFt * pricePerSqFt;
        double discountAmount = (discountPercent / 100) * priceBeforeDiscount;
        double priceAfterDiscount = priceBeforeDiscount - discountAmount;

        
        System.out.println("Price before discount: " + priceBeforeDiscount);
        System.out.println("Price after discount: " + priceAfterDiscount);
    }
}