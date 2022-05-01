package week2.day1.assignments;

public class CharOccurances {
	// Check number of occurrences of a char (eg 'e') in a String
	public static void main(String[] args) {
		
	
	int value = 0;
	String str = "welcome to chennai";

	// declare and initialize a variable count to store the number of occurrences
	
	// convert the string into char array
	char[] charArray = str.toCharArray();
	
	//get the length of the array
	int length = charArray.length;
		
	// traverse from 0 till the array length
	for(int i=0;i <length ;i++)
	{
		// Check the char array has the particular char in it 
		if(charArray[i] =='e')
		{
			// if is has increment the count
			value  = value+ 1;
		}
		
	}

	// print the count out of the loop
	System.out.println("Number of occurances of e is : " +value);
		
	}
}
