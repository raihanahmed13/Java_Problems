//Menu driven program Lect 4

import java.util.Scanner;

class Menu{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int menu;

        do
        {
            System.out.print("Enter 1/0: ");  //1 for checking marks again and 0 for only once and stop
            menu = sc.nextInt();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if(marks>90)
            {
                System.out.println("This is Good");
            }
            else if(marks>=60 && marks<=89)
            {
                System.out.println("This is Good as well");
            }

            else{
                System.out.println("This is Good as well");
            }
        }while(menu==1);

        sc.close();
       
    }
}