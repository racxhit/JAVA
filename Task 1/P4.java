/*
Using the switch statement, write a menu-driven program to calculate the maturity amount of a bank deposit.
The user is given the following options: 

(i) Term Deposit
(ii) Recurring Deposit

For option (i) accept Principal (p), rate of interest (r) and time period in years (n). 
Calculate and output the maturity amount (a) receivable using the formula a = p[1 + r / 100]n.
For option (ii) accept monthly installment (p), rate of interest (r) and time period in months (n).
Calculate and output the maturity amount (a) receivable using the formula a = p * n +( p * n(n + 1) / 2 * r / 100 * 1 /12.
For an incorrect option, an appropriate error message should be displayed.
*/

import java.util.Scanner;

class P2
{
    public static void main(String args[])
    {
        double p,r,n,a;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu:");
        System.out.println("\n1.Term Deposit");
        System.out.println("2.Recurring Deposit");
        System.out.print("\nEnter your choice: ");
        int c = sc.nextInt();

        switch(c)
        {
            case 1:
                System.out.print("\nEnter Principal Amount: ");
                p = sc.nextDouble();
                System.out.print("\nEnter Rate Of Interest: ");
                r = sc.nextDouble();
                System.out.print("\nEnter Time Period(In months): ");
                n = sc.nextDouble();

                a = p*Math.pow(1+r/100,n);
                System.out.println("\nMaturity Amount: "+ a);

                break;

            case 2:
                System.out.print("\nEnter Monthly Installment: ");
                p = sc.nextDouble();
                System.out.print("\nEnter Rate Of Interest: ");
                r = sc.nextDouble();
                System.out.print("\nEnter Time Period(In months): ");
                n = sc.nextDouble();

                a = p*n + (p*n*(n+1)/2*r/100*1/12);
                System.out.println("\nMaturity Amount: "+ a);

                break;

            default:
                System.out.println("\nInvalid Choice!");
        }
    }
}
