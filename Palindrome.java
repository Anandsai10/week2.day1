package week2.day1.assignments;

public class Palindrome {
	public static void main(String[] args) {

		// * a) Declare A String value as"madam"
		String givenValue = "mAdam";

		// * b) Declare another String rev value as ""
		String reversed = "";

		char[] charArray = givenValue.toCharArray();

		// * c) Iterate over the String in reverse order
		for (int i = givenValue.length() - 1; i >= 0; i--) {
			// * d) Add the char into rev
			char newvalue = charArray[i];
			reversed = reversed + newvalue;
		}
		System.out.println(reversed);
		if (reversed.equalsIgnoreCase(givenValue)) {

			// * e) Compare the original String with the reversed String, if it is same then
			// print palinDrome
			System.out.println("Given Value is Palindrome");
		} else {
			System.out.println("Given value is not a palindrome");
		}

	}

}
