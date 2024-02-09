/*
Implement a student class to read and display the following information using Scanner class( import java.util package)
Attributes : name,roll_no,department,University,marks in 5 subjects.Calculate the % of marks of a student and display all the information along with marks.
*/

import java.util.*;
class P2
{
	public static void main(String []args)
	{
		double m[] = new double[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Full Name: ");
		String n = sc.nextLine();
		
		System.out.print("Input Roll No.: ");
		int rn = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Input Department Name: ");
		String dn = sc.nextLine();
		
		System.out.print("Input University Name: ");
		String un = sc.nextLine();
		
		double sum = 0;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Input Marks " + (i+1) + ": ");
			m[i] = sc.nextDouble();
			sum = sum + m[i];
		}
		
		double p = sum / 5.0;
		
		System.out.println("\nName: " + n + "\n\nRoll No.: " + n + "\n\nDepartment: " + dn + "\n\nUniversity: " + un + "\n");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Marks " + (i+1) + ": " + m[i]);
		}
		
		System.out.println("\nPercentage: " + p);
	}
}