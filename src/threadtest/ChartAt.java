package threadtest;

public class ChartAt {
	public static void main(String[] args)
	{
		String s = "ceshi";
		//System.out.println((int)s.charAt(0));
		//System.out.println((int)s.charAt(1));
		
		
		if(s.charAt(0) < s.charAt(1))
		{
			//System.out.println("xiao");
		}
		else
		{
			//System.out.println("da");
		}
		
		
		short s2 = 1;
		s2 =  (short) (s2 + 1);
		//System.out.println(s2);
		
		
		short s1= 2;
		s1 += 5;
		//System.out.println(s1);
		
		s1 += 6;
		//System.out.println(s1);
		
		
		short s3 = 2;
		s3 =+ 5;
		System.out.println(s3);
		System.out.println(s3);
		
		s3 =+ 6;
		System.out.println(s3);
	}

}
