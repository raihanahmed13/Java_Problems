//Switch case

import java.util.Scanner;

class switch_case {
    public static void main(String srgs[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the button: ");
        int button = sc.nextInt();

        switch (button) {

            case 1:
                System.out.print("Hello");
                break;

            case 2:
                System.out.print("Namaste");
                break;

            case 3:
                System.out.print("Bonjour");
                break;

            default:
                System.out.print("Enter valid button");

        }

        sc.close();

    }
}