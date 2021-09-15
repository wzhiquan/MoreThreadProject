package threadtest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					System.out.println("通过线程池创建的线程：" + Thread.currentThread().getName());
				}
			};
			executorService.execute(runnable);
		}
		executorService.shutdown();
	}

}
