package exceptiontest;

public class ExceptionTest2 
{
	public static void main(String args[])
	{
		System.out.println(5+0);
		try
		{
       System.out.println(5/0);
			}
		catch(Exception ae)
		{
		System.out.println(ae.getMessage());
	    ae.printStackTrace();
		}
		finally
		{
			System.out.println("hlw");	
	}
		    System.out.println("JAVA");
	}
	}


