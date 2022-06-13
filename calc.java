//Calculator

import java.util.Scanner;

class calc{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second num: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operator: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.print("Sum = "+(num1+num2));
                break;
            case '-':
                System.out.print("Difference = "+(num1-num2));
                break; 
            case '*':
                System.out.print("Multiplication = "+(num1*num2));
                break; 
            case '/':
                System.out.print("Division = "+(num1/num2));
                break; 
                
            case '%':
                System.out.print("Remainder = "+(num1%num2));
                break;
        
            default:
            System.out.print("Enter valid operator!!");
                break;
        }

        sc.close();




    }

}