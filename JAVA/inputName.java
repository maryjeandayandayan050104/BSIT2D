/*
 * NAME         : DAYANDAYAN, MARY JEAN C.
 * YEAR/SECTION : BSIT 2D
 * Lab Example 5
 */

import java.io.*;
public class inputName {
    private static BufferedReader num=new BufferedReader (new InputStreamReader (System.in));
    public static void main(String[]args) throws IOException{
        System.out.print("Enter a Name: ");
        String Name = num.readLine();
        System.out.println("The Inputted Name is: "+ Name);
    }
}
