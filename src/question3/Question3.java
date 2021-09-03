package question3;

import java.io.IOException;
import java.util.Scanner;

public class Question3 {

	static Scanner sc = new Scanner(System.in);
	
	static void singleTryCatch(int x, int y) {
		
		try {
			System.out.println(x/y);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block executed");
		}
	}
	
	static void multipleTryCatch(int x, int y) {
		
		try {
			System.out.println(x/y);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block executed");
		}
	}
	
	static void nestedTryCatch() {
		try{     
				try{   
				    int a =1/0; 
				}
			    catch(ArithmeticException e)  
			    {  
			      System.out.println("Divided by zero");  
			    }
				
			    try{    
				    int b[]=new int[5];
				    b[5]=4;    
			    } 
			    catch(ArrayIndexOutOfBoundsException e)  {  
			       System.out.println(e);  
			    }
			    System.out.println("This statement executes as the exceptions are caught");    
			  } 
			  catch(Exception e)  
			  {  
			    System.out.println("handled the exception");  
			  }
			  System.out.println("normal flow..");
	}
	
	static void throwKeywordCheck(int n) {
		if(n<18) {  
            throw new ArithmeticException("An exception is thrown here");    
        }  
        else {  
            System.out.println("No exception");  
        }  
	}
	
	static void throwsKeywordCheck(int n)throws IOException{
		if(n == 1) {
			throw new IOException("device error");
		}
		else {
			System.out.println("Normal Flow");
		}
	}  
	
	public static void main(String[] args) {
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		singleTryCatch(x,y);
		multipleTryCatch(x,y);
		nestedTryCatch();
		
		throwKeywordCheck(12);
		throwKeywordCheck(20);
		
		try {
			throwsKeywordCheck(10);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			throwsKeywordCheck(1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
