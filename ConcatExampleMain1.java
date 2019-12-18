package Stringmethods;

public class ConcatExampleMain1 {
	public static void main(String [] args)
	{
		String s1 = "java string";
		s1.concat("is immutable");
	    System.out.println(s1);//concat will not happen string is immutable
	    s1=s1.concat(" is immutable so assign explplicitly");
	    System.out.println(s1);//to concat need of create object
	}

}
