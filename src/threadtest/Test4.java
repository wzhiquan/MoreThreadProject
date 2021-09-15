package threadtest;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Test4 {
	public static void main(String[] args) {
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		ThreadInfo[] threadInfo = threadMXBean.dumpAllThreads(false, false);

		for (ThreadInfo tempInfo : threadInfo) {
			System.out.println(tempInfo.getThreadId() + ":" + tempInfo.getThreadName());
		}
	}
}
