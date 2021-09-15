package threadtest;

public class Test7 
{
	public static void main(String[] args) 
	{
		int x ;
		int y ;
		for (x = 0; x < 100; x++)
		{
			for(y = 0; y < 100; y++)
			{
				if((8 * x - 3 * y == 558) && ( x + y == 100))
				{
					System.out.println("x=:" + x);
					System.out.println("y=:" + y);
				}
			}
		}
	}
}



