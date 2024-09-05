package weekend3Assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length())
			System.out.println("Length matches");
		else
			System.out.println("Lengths mismatch");

		char[] char1 = text1.toCharArray();
		char[] char2 = text2.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);

		if (char1 == char2)
			System.out.println("The given strings are Anagram.");
		else
			System.out.println("The given strings are not an Anagram.");

	}

}
