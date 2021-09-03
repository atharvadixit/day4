package question4;

import java.util.Scanner;

public class Question4 {
	
	static void validateRange(int x, int y, int z) throws InvalidRangeException{
		if(z>= x && z<=y) {
			System.out.println("The range you have entered is correct");
		}
		else
		{
			throw new InvalidRangeException("The number " + z + " is not within " + x + " & " + y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("You can have a maximum range of 50 inclusive");
		System.out.println("Enter start number:");
		int x = sc.nextInt();
		System.out.println("Enter end number:");
		int y=sc.nextInt();
		System.out.println("Enter a number:");
		int z=sc.nextInt();
		try {
			validateRange(x,y,z);
		}
		catch(InvalidRangeException ex)
		{
			System.out.println("Caught the exception"); 
            System.out.println("Exception occured: " + ex);  
		}
		sc.close();
	}
}
