//odd or even
import java.util.Scanner;

class oddeven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.print("Even");
        }

        else
        {
            System.out.print("Odd");
        }

        sc.close();
        
    }
}