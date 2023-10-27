/*
 * NAME         : DAYANDAYAN, MARY JEAN C.
 * YEAR/SECTION : BSIT 2D
 * Payroll WITH Overtime Hour/s
 */

import java.io.*;
public class Payroll_System2 {
    private static PrintStream o = System.out;
    private static BufferedReader num=new BufferedReader (new InputStreamReader (System.in));
    public static void main (String[]args) throws IOException{
        o.print("Enter Employees Name: ");
        num.readLine();
        o.print("Enter No. of Hour/s Worked: ");
        int NHW = Integer.parseInt(num.readLine());

        o.print("\n\n");

        double NI2 = 40 * 62.35;
        o.println("Net Income is: "+ NI2);

        double SSS = NI2 * 0.0828;
        double PH = NI2 * 0.0915;
        double PI = NI2 * 0.0702;
        double TAX = NI2 * 0.12;

        double OTH = NHW - 40;
        o.println("Overtime Hour/s is: "+ OTH);
        double OTF = OTH * 1.5 * 62.35;
        o.println("Overtime Fee is: "+ OTF);

        double TD2 = SSS + PH + PI + TAX;
        o.println("Total Deduction is: "+ TD2);

        o.print("\n\n");

        double NP2 = (NI2 - TD2)+ OTF;
        o.print("Net Pay is: "+ NP2);
    }
}
