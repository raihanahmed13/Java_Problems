//Make a program that takes the radius of a circle as input, calculates its area and prints it as output to the user

import java.util.Scanner;

class Q2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the raidus: ");
        int r = sc.nextInt();

        double area = 3.14*r*r;

        System.out.print("Area of the circle: "+area);

        sc.close();
    }
}