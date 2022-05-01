package week2.day1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		ReverseEvenWords rev = new ReverseEvenWords();
		rev.sirCode();
	}

	public static void myCode() {
		// Build a logic to reverse the even position words (output: I ma a erawtfos
		// tester)

		// * Declare the input as Follow
		String test = "I am a software tester";
		String newValue = "";
		String secondValue = "";
		String thirdValue = "";
		String sentence = "";

		// a) split the words and have it in an array
		String[] splitString = test.split(" ");

		// b) Traverse through each word (using loop)
		for (int i = 0; i < splitString.length; i++) {
			if (i % 2 != 0) {
				newValue = newValue + " " + splitString[i];
			} else {
				sentence = sentence + " " + splitString[i];
			}
		}
		String[] splitSecond = newValue.trim().split(" ");
		char[] charArray = splitSecond[0].toCharArray();
		char[] secondArray = splitSecond[1].toCharArray();

		for (int j = charArray.length; j > 0; j--) {
			secondValue = secondValue + charArray[j - 1];
		}
		for (int z = secondArray.length; z > 0; z--) {
			thirdValue = thirdValue + secondArray[z - 1];
		}

		// for (int k=0; k < splitString.length ; k++)
		// {
		// if(k%2 != 0) {
		// String secjoin = secondValue;
		// String thirdjoin = thirdValue;
		// }else
		// {
		// sentence = splitString[k] + " " +secondValue + " "+ " " +thirdValue ;
		// }
		// }
		System.out.println("value is : " + newValue);
		System.out.println("value is : " + sentence);
		System.out.println("value is : " + secondValue);
		System.out.println("value is : " + thirdValue);

		// c) find the odd index within the loop (use mod operator)
		//
		// d)split the words and have it in an array
		//
		// e)print the even position words in reverse order using another loop (nested
		// loop)
		// f) Convert words to character array if the position is even else print the
		// word as it is(concatenate space at the end).
		//

	}
	
	
	public static void sirCode() {
		String name = "I am a software tester";
		String[] split = name.split(" ");
		String newname = "";
		int len = split.length;   // I , am , Iron , Man
		for(int i =0; i<len; i++) {
			if(i%2==0) {
				System.out.print(" ");
				System.out.print(split[i]);
					
				}
			else {
				System.out.print(" ");
				char[] cc = split[i].toCharArray();
				
				for(int j=cc.length-1; j>=0 ; j-- ) {
				System.out.print(cc[j]);
			}
		}

	}

	}
}

