import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String binary = "";

        if (number == 0) {
            binary = "0";
        } else {
            while (number > 0) {
                int remainder = number % 2;
                binary = remainder + binary;
                number = number / 2;
            }
        }

        System.out.println("Binary representation: " + binary);

        scanner.close();
    }
}