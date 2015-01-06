package process;

import org.junit.Test;

public class WorkerTest {
	@Test
	public void multiThreadTest() {

		Worker R1 = new Worker("Thread-1");
		R1.start();

		Worker R2 = new Worker("Thread-2");
		R2.start();
	}
}