package question5;

import java.util.Scanner;

import question4.InvalidRangeException;

public class Question5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter a number:");
		if(sc.hasNextInt()) {
			x = sc.nextInt();
			System.out.println(x + " is a valid integer");
		}
		else
		{
			throw new InvalidInputException("The input is not an integer");
		}
		sc.close();
	}

}
