//Taking  input

import java.util.Scanner;

class input
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter int vlaue: ");
        int a = sc.nextInt();

        System.out.print("Enter float vlaue: ");
        float f = sc.nextFloat();


        System.out.println(name);
        System.out.println(a);
        System.out.print(f);


        sc.close();

    }
}