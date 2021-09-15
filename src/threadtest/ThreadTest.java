package threadtest;

import java.io.UnsupportedEncodingException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest 
{
	public static class DoRun implements Runnable
	{
		@Override
		public void run()
		{
			System.out.println("11");
		}
	}
	
	private static class DoCall implements Callable<String>
	{
		@Override
		public String call() throws Exception 
		{
			return "22";
		}
	}
	
	
	
	public static void md5Test(String url) throws NoSuchAlgorithmException, UnsupportedEncodingException
	{
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(url.getBytes("UTF-8"));;
		byte[] digest = md5.digest();
		for(int i=0; i<digest.length; i++)
		{
			
		}
	}
	
	
	public static void main (String[] args) throws InterruptedException, ExecutionException
	{
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		ThreadInfo[] dumpAllThreads = threadMXBean.dumpAllThreads(false, false);
		for(ThreadInfo temp: dumpAllThreads)
		{
			System.out.println(temp.getThreadId());
		}
		
		
		DoRun doRun = new DoRun();
		Thread thread1 = new Thread(doRun);
		thread1.start();
		
		DoCall doCall = new DoCall();
		FutureTask<String> futureTask = new FutureTask<>(doCall);
		Thread thread2 = new Thread(futureTask);
		thread2.start();
		System.out.println(futureTask.get());
		
		
		
		Map<String, String> sdf = Collections.synchronizedMap(new HashMap<>(50));
		
		
		
	}
}
