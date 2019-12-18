package Stringmethods;

public class CompareToExampleMain2 {
	public static void main(String[] args)
	{


		String S1 = "hello";
		String S2 = "";
		String S3 = "me";
		
		System.out.println(S1.compareTo(S2));//5 bcs 5-0=5
		
		System.out.println(S1.compareTo(S3));//-5 bcs 'h' is 5 times smaller than 'm'
    }

}
