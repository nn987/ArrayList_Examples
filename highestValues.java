 



public class highestValues {

int[] numbers = new int[50];
	int highest = numbers[0];
	for (int i=1; i < numbers.length; i++)
	{
		if (numbers[i] > highest)
			highest = numbers[i];
	}
 
//lowest value
	int lowest = numbers[0];
	for (int i = 1; i < numbers.length; i++)
	{
		if (numbers[i] < lowest)
			lowest = numbers[i];
	}
}