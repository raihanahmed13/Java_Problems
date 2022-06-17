//Advanced Patterns
//Solid Rhombus
//     *****
//    ***** 
//   *****  
//  *****
// *****

import java.util.Scanner;

class advpatt_2
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            int space = n-i;  //spaces in every line before stars
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();


    }
}