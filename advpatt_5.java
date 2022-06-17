//Advanced Patterns
//Diamond

import java.util.Scanner;

class advpatt_5
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)  //upper pyramid
        {
            int space=n-i;
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--)
            {
                System.out.print("*");
            }
            for(int j=2; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i=n; i>=1; i--)  //lower pyramid
        {
            int space=n-i;
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--)
            {
                System.out.print("*");
            }
            for(int j=2; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

   
        sc.close();


    }
}