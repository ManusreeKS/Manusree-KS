package Stringmethods;

public class ConcatExampleMain3 {
	

	public static void main(String[] args)
	{
		String str1 = "Hello";
		String str2 = "FACE@2.0";
		String str3 = "Reader";
		//concating space among strings
		String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);
		System.out.println(str4);
		//concating special chahracters
		String str5 = str1.concat("!!!!");
		System.out.println(str5);
		String str6 = str1.concat("@").concat(str2);
		System.out.println(str6);

	}

}
