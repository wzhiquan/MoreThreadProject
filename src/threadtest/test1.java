package threadtest;

public class test1 {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};

		thread.setName("t1");
		thread.start();
	}
}
