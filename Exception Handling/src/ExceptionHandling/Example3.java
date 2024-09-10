package ExceptionHandling;

public class Example3
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=2;
		int div=0;
		
		try
		{
			 div=a/b;    //   10/2               //risky code
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		
		
		System.out.println(div);
		
		System.out.println("hi");
		System.out.println("GM");
		
		
	}
}
