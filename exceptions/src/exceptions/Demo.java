package exceptions;

public class Demo {
	public static void main(String[] args) {
		try {
		int a=50/0;
	}
		catch(Exception e)
		{
		 e.printStackTrace();	
		}
		System.out.println("hi");
	
	}
}
