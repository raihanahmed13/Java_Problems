//Greater or lesser 

import java.util.Scanner;

class compare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.print("a is greater");
        } else {
            System.out.print("b is greater");
        }

        sc.close();

    }
}