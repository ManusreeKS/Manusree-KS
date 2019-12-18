package Stringmethods;
public class CharAtExampleMain3 {
	public static void main(String[]args)
	{
		String str = "Welcome to FACE portal";
		int strLength = str.length();
		//fetching first character
		System.out.println("Character at 1st index is  :"+str.charAt(1));
		//the last character is present at the string length-1 index
		System.out.println("Character at last index is  :"+str.charAt(strLength-1));
		
	}

}
