/*
 * NAME         : DAYANDAYAN, MARY JEAN C.
 * YEAR/SECTION : BSIT 2D
 * 1st Activity on Yellow Paper
 */

import java.io.*;
public class firstActivity {
    private static BufferedReader num=new BufferedReader (new InputStreamReader (System.in));
    public static void main(String[]args) throws IOException{

        System.out.print("Enter a First Number: ");
        double firstNumber = Integer.parseInt(num.readLine());
        System.out.print("Enter a Second Number: ");
        double secondNumber = Integer.parseInt(num.readLine());

        double sum = firstNumber + secondNumber;
        double diff = firstNumber - secondNumber;
        double prod = firstNumber * secondNumber;
        double quot = firstNumber / secondNumber;

        System.out.println("The Sum is: "+ sum);
        System.out.println("The Difference is: "+ diff);
        System.out.println("The Product is: "+ prod);
        System.out.println("The Quotient is: "+ quot);
    }
}
