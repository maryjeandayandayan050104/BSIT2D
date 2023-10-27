/*
 * NAME         : DAYANDAYAN, MARY JEAN C.
 * YEAR/SECTION : BSIT 2D
 * Payroll WITHOUT Overtime Hour/s
 */

import java.io.*;
public class Payroll_System1 {
    private static PrintStream o = System.out;
    private static BufferedReader num=new BufferedReader (new InputStreamReader (System.in));
    public static void main (String[]args) throws IOException{
        o.print("Enter Employees Name: ");
        num.readLine();
        o.print("Enter No. of Hour/s Worked: ");
        int NHW = Integer.parseInt(num.readLine());

        o.print("\n\n");

        double NI = NHW * 62.35;
        o.println("Net Income is: "+ NI);

        double SSS = NI * 0.0828;
        o.println("Social Security System is: "+ SSS);
        double PH = NI * 0.0915;
        o.println("PhilHealth is: "+ PH);
        double PI = NI * 0.0702;
        o.println("Pag Ibig is: "+ PI);
        double TAX = NI * 0.12;
        o.println("TAX is: "+ TAX);
        double TD = SSS + PH + PI + TAX;
        o.println("Total Deduction is: "+ TD);

        o.print("\n\n");

        double NP = NI - TD;
        o.print("Net Pay is: "+ NP);
    }
}
