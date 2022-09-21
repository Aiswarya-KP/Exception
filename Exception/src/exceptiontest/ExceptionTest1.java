package exceptiontest;

public class ExceptionTest1 
{
	public static void main(String args[])
	{
		System.out.println(5+0);
		try
		{
		System.out.println(5/0);}
		catch(ArithmeticException ae)
		{
			
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		System.out.println(5*0);
		
}}
