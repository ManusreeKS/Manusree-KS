package objectClass;

public class Objectclass {
	static int last_roll = 100;
	int roll_no;
	Objectclass()
	{
		roll_no = last_roll;
		last_roll++;
	}
	public int hashCode()
	{
		return roll_no;
		
	}
	
	
     public static void main(String args[])
     {
    	 Objectclass s= new Objectclass();
    	 System.out.println(s);
    	 System.out.println(s.toString());
    	 Object obj = new String("FACE");
    	 @SuppressWarnings("rawtypes")
		Class c = obj.getClass();
    	 System.out.println("Class of Object obj is : "+c.getName());
    	 s=null;
    	 System.gc();//(garbage collection)
     }
     protected void finalize()
     {
    	 System.out.println("finalize method called");
     }
}