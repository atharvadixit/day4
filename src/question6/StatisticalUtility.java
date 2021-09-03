package question6;

import question4.InvalidRangeException;

public class StatisticalUtility {
	
	public int getAverageValue(int[] a, int min, int max) throws InvalidRangeException{
		
		int avg=0;
		for(int i=0;i<10;i++)
		{
			avg+=a[i];
		}
		avg/=10;
		if(avg>= min && avg<=max) {
			return avg;
		}
		else {
			throw new InvalidRangeException("The avgerage " + avg + " is not within " + min + " & " + max);
		}
	}
}
