package threadtest;

public class TestMain 
{
    public static void main(String[] args)
    {
    	int x = 1;
    	int y= 1;
    	if(x == y)
    	{
    		System.out.println("== is true");
    	}
    	
    	if(x == 1)
    	{
    		System.out.println("asdfasd");
    	}
    	
    	if("1".equals(String.valueOf(y)))
    	{
    		System.out.println("equals 1 is true");
    	}
    	if(String.valueOf(x).equals(String.valueOf(y)))
    	{
    		System.out.println("equals 2 is true");
    	}
    }
}
