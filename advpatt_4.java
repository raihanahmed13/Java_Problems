//Advanced Patterns
//Palindrome

import java.util.Scanner;

class advpatt_4
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            int space = n-i;
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--)  //First half
            {
                System.out.print(j);
            }

            for(int j=2; j<=i; j++)  //Second half
            {
                System.out.print(j);
            }
            System.out.println();
        }

       
        sc.close();


    }
}