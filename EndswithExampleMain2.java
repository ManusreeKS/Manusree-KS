package Stringmethods;

public class EndswithExampleMain2 {
	public static void main(String [] args)
	{
		String str = "Welcome to FACE.in";
		System.out.println(str.endsWith("in"));
		if(str.endsWith(".com"))
		{
			System.out.println("String ends with.com");
			
		}
		else
			System.out.println("It does not ends with .com");
	} 

}
