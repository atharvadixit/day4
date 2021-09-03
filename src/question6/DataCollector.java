package question6;

import question4.InvalidRangeException;
import question5.InvalidInputException;

public class DataCollector {
	
	public int getResult(int[] d, int min, int max, int v1, int v2) throws InvalidInputException, InvalidRangeException{
		StatisticalUtility statisticalUtility = new StatisticalUtility();
		int average = statisticalUtility.getAverageValue(d, min, max);
		
		int result = (average*v1)/v2;
		return result;
	}
}
