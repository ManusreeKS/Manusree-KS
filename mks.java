package class_over;
public class mks 
{    
	private int n=10;
	class Inner
	{
		void add()
		{
			System.out.println("The value of n is : "+n);
		}
	}
	public static void main(String args[])
	{
		mks m = new mks();
		mks.Inner b = m.new Inner();
		b.add();
	}
}	