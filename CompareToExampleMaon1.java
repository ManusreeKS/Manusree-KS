package Stringmethods;

public class CompareToExampleMaon1 {
	public static void main(String args[])
	{
		String S1 = "hello";
		String S2 = "hello";
		String S3 = "meklo";
		String S4 = "hemlo";
		String S5 = "flag";
		
		System.out.println(S1.compareTo(S2));//0 bcs both are eql
		System.out.println(S1.compareTo(S3));//-5 bcs "h" is 5 times lower than "m"
		System.out.println(S1.compareTo(S4));//-1 bcs "l" is 1 times lower than "m"
		System.out.println(S1.compareTo(S5));//-1 bcs "h" is 2 times greater than "f"
		
	}

}
