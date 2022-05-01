package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
	
	
//	 *Declare a String 
//		String text1 = "stops";
//	 *Declare another String
//		String text2 = "potss"; 
	
	String text1 = "stops";
	String text2 = "potss";
	String firstchar ="";
	String secondchar ="";
	
	int first = text1.length();
	int second = text2.length();
	
	if(first == second) 
	{
		char[] charArray = text1.toCharArray();
		char[] charArraysec = text2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArraysec);
		//firstMethod
		boolean bvalue =	Arrays.equals(charArray, charArraysec);
	if(bvalue == true ) {
		System.out.println("arrays are equal");
	}
	else {
		System.out.println("arrays are not equal");
	}
	
	//secondMethod
		for(int i=0; i<charArray.length; i++)
		{
			 firstchar = firstchar + charArray[i];
			 secondchar = secondchar + charArraysec[i];
		}
		if(firstchar.equals(secondchar))
		{
			System.out.println("Values are equal, so its a ANAGRAM  " +firstchar+ " and " +secondchar);
		}
		else {
			System.out.println("values are not equal, so its not a ANAGRAM");
		}
	}
	else 
	{
		System.out.println("Given strings are not equal");
	}

	}
}


