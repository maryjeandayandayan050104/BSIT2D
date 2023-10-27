/*
 * NAME         : DAYANDAYAN, MARY JEAN C.
 * YEAR/SECTION : BSIT 2D
 * Lab Example 4
 */

import java.io.*;
public class inputNumber {
    public static BufferedReader num=new BufferedReader (new InputStreamReader (System.in));
    public static void main(String[]args) throws IOException{
        System.out.print("Enter a Number: ");
        int Number = Integer.parseInt(num.readLine());
        System.out.println("The Inputted Number is: "+ Number);
    }
}
