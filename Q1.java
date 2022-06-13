//take 2 variables and print their sum

import java.util.Scanner;

class Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        int a = sc.nextInt();

        System.out.print("Enter the second num: ");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.print("Sum = "+sum);

        sc.close();
    }
}