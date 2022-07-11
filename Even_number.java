 // Java Program to Print Even Numbers from 1 to N using For loop


import java.util.Scanner;

public class Even_number {
	
	public static void main(String[] args) 
	{
 
		Scanner sc = new Scanner(System.in);

		System.out.println(" Welcome to even number checker ");

		System.out.print(" Please Enter any Number : ");

		int number = sc.nextInt();	
		
		for(int i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i +"\t"); 
			} 
		}	
	}
}
