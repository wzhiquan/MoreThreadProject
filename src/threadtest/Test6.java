package threadtest;

public class Test6 
{
	static int i = 5;
	
	public int add ()
	{
		//i++;
		//++i;
		return ++i;
		//return i++;
	}
	
	public static void main(String[] args) 
	{
		Test6 test6 = new Test6();
		System.out.println(test6.add());
	}
}
