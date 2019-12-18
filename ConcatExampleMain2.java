package Stringmethods;

public class ConcatExampleMain2 {
	public static void main(String[] args)
	{
		String str1 = "Hello";
		String str2 = " Hi";
		String str3 = " Reader";
		//concating one string
		String str4 = str1.concat(str2);
		System.out.println(str4);
		//concating multiple strings
		String str5 = str1.concat(str2).concat(str3);
		System.out.println(str5);


		
	}

}
