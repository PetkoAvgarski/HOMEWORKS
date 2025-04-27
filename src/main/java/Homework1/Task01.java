package Homework1;
import java.util.Scanner;
public class Task01 {
    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter one integer ");
        int a = in.nextInt();
        System.out.println("The first integer is " + a);

        System.out.print("Enter second integer ");
        int b = in.nextInt();
        System.out.println("The second integer is " + b);

        System.out.print("Enter third integer ");
        int c = in.nextInt();
        if (c > a && c < b) {
            System.out.println( c + " is between " + a + " and " + b);
        } else {
            System.out.println( c + " isn`t between " + a + " and " + b);
        }
    }
}
