package ExceptionHandling;

public class Example14 
{
	public static void main(String[] args) 
	{
		
		int [] ar=new int[4];        
		
		try
		{
			ar[5]=10;                  
		}
		catch(Exception s1)
		{
			System.out.println("generic Exception handled");
			s1.printStackTrace();
		}
	
		
		System.out.println("Hello");

	}
}
