//Advanced Patterns
//Butterfly

import java.util.Scanner;

class advpatt_1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)  //upper half
        {
            for(int j = 1; j<=i; j++)  //first part
            {
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j = 1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)   //second part
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = n; i>=1; i--)   //lower half
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j = 1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();


    }
}