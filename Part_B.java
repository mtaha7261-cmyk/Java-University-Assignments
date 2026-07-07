import java.util.Scanner;

public class Part_B {

    
    public static int[] toBinaryArray(int number) {
        if (number == 0) {
            return new int[]{0};
        }

        int temp = number;
        int count = 0;

        // Count digits
        while (temp > 0) {
            temp /= 2;
            count++;
        }

        int[] binary = new int[count];

        // Fill array
        for (int i = count - 1; i >= 0; i--) {
            binary[i] = number % 2;
            number /= 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int[] result = toBinaryArray(num);

        System.out.print("Binary array: ");
        for (int bit : result) {
            System.out.print(bit);
        }

        sc.close();
    }
}