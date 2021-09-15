package threadtest;

public class test2 {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread thread = new Thread(runnable, "t2");
		thread.start();
	}
}
