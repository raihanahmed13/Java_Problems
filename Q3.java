//Area of Rectangle,sqaure,triangle and circle

import java.util.Scanner;

class Q3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter R/r for rectangle, S/s for square, T/t for Triangle, C/c for corcle: ");
        char c = sc.next().charAt(0);

        if (c == 'R' || c == 'r') {
            System.out.print("Enter length: ");
            int l = sc.nextInt();
            System.out.print("Enter breadth: ");
            int b = sc.nextInt();
            System.out.print("Area of the Rectangle: " + (l * b));
        }

        else if (c == 'S' || c == 's') {
            System.out.print("Enter the side of the sqaure: ");
            int s = sc.nextInt();
            System.out.print("Area of the Square: " + (s * s));
        }

        else if (c == 'T' || c == 't') {
            System.out.print("Enter height: ");
            int h = sc.nextInt();
            System.out.print("Enter base: ");
            int b = sc.nextInt();
            System.out.print("Area of the Triangle: " + (h * b) / 2);
        }

        else if (c == 'C' || c == 'c') {
            System.out.print("Enter radius: ");
            int r = sc.nextInt();
            System.out.print("Area of the Circle: " + (3.14 * r * r));
        }

       else {
            System.out.print("Invalid Input!!");
        }

        sc.close();

    }
}