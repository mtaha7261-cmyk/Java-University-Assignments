import java.util.Scanner;
public class population
{
    public static void main (String[] args)
    {
        Scanner C = new Scanner(System.in);
        int pop = 1;
        int total = 0;
        System.out.println("Enter Population Values");
        while(pop>0)
        {
            pop = C.nextInt();
            total= total+pop;
            System.out.println("total = "+total);
        }

        
    }
}