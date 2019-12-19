package Stringmethods;

public class EqualsExampleMaiin1 {
	public static void main(String[]args)
	{
		String s1 = "facenow";
		String s2 = "facenow";
		String s3 = "faceprep";
		String s4 = "facenxt";
		System.out.println(s1.contentEquals(s2));//true bcs content and case are same
		System.out.println(s1.contentEquals(s3));//false bcs case is not same
		System.out.println(s1.contentEquals(s4));//false bcs content is not same
		
	}

}
