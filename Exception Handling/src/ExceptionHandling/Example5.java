package ExceptionHandling;

public class Example5 
{
	public static void main(String[] args) 
	{
		
		int [] ar=new int[4];         //0-3
		
		try
		{
			ar[5]=10;                  //risky code
		}
		catch(Exception s1)
		{
			System.out.println("generic Exception handled");
			s1.printStackTrace();
		}
	
		
		System.out.println("Hello");

	}
}
