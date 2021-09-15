package threadtest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class test3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<Integer> futureTask = new FutureTask<>(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				System.out.println(Thread.currentThread().getName());

				// ʹ�߳����ߵ����ַ�ʽ��TimeUnit���и��õĿɶ��ԣ�ֱ����ȷ����ʱ����
				// Thread.sleep(3000);
				TimeUnit.SECONDS.sleep(2);
				return 999;
			}
		});

		Thread thread = new Thread(futureTask, "t3");
		thread.start();

		Integer num = futureTask.get();
		System.out.println(num);
	}
}
