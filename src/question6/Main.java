package question6;

import java.util.Scanner;

import question4.InvalidRangeException;
import question5.InvalidInputException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 10 integers");
		int[] a=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter min: ");
		if(!sc.hasNextInt())
			throw new InvalidInputException("The input is not an integer");
		int min = sc.nextInt();
		System.out.println("Enter max: ");
		if(!sc.hasNextInt())
			throw new InvalidInputException("The input is not an integer");
		int max = sc.nextInt();
		
		System.out.println("Enter v1: ");
		if(!sc.hasNextInt())
			throw new InvalidInputException("The input is not an integer");
		int v1 = sc.nextInt();
		System.out.println("Enter v2: ");
		if(!sc.hasNextInt())
			throw new InvalidInputException("The input is not an integer");
		int v2 = sc.nextInt();
		
		try {
			DataCollector d = new DataCollector();
			int result = d.getResult(a,min,max,v1,v2);
			System.out.println("The result is: " + result);
		}
		catch(InvalidRangeException ex) {
			
			throw new InvalidInputException("Exception occured: " +ex);
		}
		
		sc.close();
	}

}
