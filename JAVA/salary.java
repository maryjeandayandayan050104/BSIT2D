/*
 * NAME         : DAYANDAYAN, MARY JEAN C.
 * YEAR/SECTION : BSIT 2D
 * 2nd Activity on Yellow Paper
 */

import java.io.*;
public class salary{
    public static BufferedReader num=new BufferedReader (new InputStreamReader (System.in));
    public static void main (String[]args) throws IOException{
        System.out.print("\nEmployee Name: ");
        num.readLine();
        System.out.print("No. of hours worked: ");
        double hours = Double.parseDouble(num.readLine());           

        if(hours>40){
            // Calculate overtime fee
            double pay_rate = 62.35;
            double net_income1 = hours*pay_rate;
            double overtime_hours = hours-40;
            double overtime_fees = (pay_rate*1.5)*overtime_hours;
            int deduction1 = 0;

            /*
             * String.format() method in Java is used to return a formatted 
             * string using a specified format string and arguments.
             */

            // Display calculated overtime fee
            System.out.println("Net Income: "+String.format("%.2f", net_income1));
            System.out.println("Overtime Hour/s: "+String.format("%.0f", overtime_hours));
            System.out.println("Overtime Fee/s: "+String.format("%.2f", overtime_fees));
            System.out.println("Total Deduction: "+deduction1);

            // Display Total Net Pay
            double net_pay1 = net_income1 + overtime_fees;
            System.out.print("\nNet Pay: "+String.format("%.2f", net_pay1));
        
        }else{
            // Converted values deducted from employees gross pay
            double pay_rate = 62.35;
            double converted_sss = 0.0828;
            double converted_ph = 0.0915;
            double converted_pi = 0.0702;
            double converted_tax = 0.12;

            // Calculate deductions based on the converted values
            double net_income2 = hours*pay_rate;
            double sss = net_income2*converted_sss; 
            double ph = net_income2*converted_ph; 
            double pi = net_income2*converted_pi;
            double tax = net_income2*converted_tax;

            // Display calculated converted deductions
            System.out.println("Net Income: "+String.format("%.2f", net_income2));
            System.out.println("SSS: "+String.format("%.2f", sss));
            System.out.println("P.H: "+String.format("%.2f", ph));
            System.out.println("P.I: "+String.format("%.2f", pi));
            System.out.println("TAX: "+String.format("%.2f", tax));
            
            // Total Deduction
            double deduction2 = sss+ph+pi+tax;
            System.out.println("Total Deduction: "+String.format("%.2f", deduction2));

            // Total Net Pay 
            double net_pay2 = net_income2 - deduction2;
            System.out.print("\nNet Pay: "+String.format("%.2f", net_pay2));
        }
    }
}