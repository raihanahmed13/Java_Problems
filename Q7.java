//Print all even numbers till n

import java.util.Scanner;

class Q7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the vlaue of n: ");
        int n = sc.nextInt();

        int i=0;
        while(i<=n)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }

        sc.close();
    } 
}