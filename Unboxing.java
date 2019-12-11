package wrapper;

public class Unboxing {
	public static void main(String args[])
	{
		//converting Integer to int
		Integer a  = new Integer(10);
		int i = a.intValue();//Converting Integer to int
		int j = i ;//unboxing, now compiler will write a.intValue()internally
		System.out.println(a+" "+i+" "+j);
	 }
	}


