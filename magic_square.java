import java.util.Scanner;

public class magic_square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        System.out.println("Enter 9 elements:");

        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int r1 = a[0][0] + a[0][1] + a[0][2];
        int r2 = a[1][0] + a[1][1] + a[1][2];
        int r3 = a[2][0] + a[2][1] + a[2][2];

        int c1 = a[0][0] + a[1][0] + a[2][0];
        int c2 = a[0][1] + a[1][1] + a[2][1];
        int c3 = a[0][2] + a[1][2] + a[2][2];

        int d1 = a[0][0] + a[1][1] + a[2][2];
        int d2 = a[0][2] + a[1][1] + a[2][0];

        if(r1 == r2 && r2 == r3 &&
           r1 == c1 && c1 == c2 && c2 == c3 &&
           r1 == d1 && d1 == d2) {
            System.out.println("Magic Square");
        } 
        else {
            System.out.println("Not a Magic Square");
        }

        sc.close();
    }
}