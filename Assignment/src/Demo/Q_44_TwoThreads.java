/*W.A.J.P to create 2 threads and execute that threads by providing sleep time as
2000ms and check the execution.*/
package Demo;

class newthread extends Thread {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName());
			// Adding a short delay
			Thread.sleep(2000); // Sleep for 1 second
			System.out.println(Thread.currentThread().getName() + " complated");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Q_44_TwoThreads {

	public static void main(String[] args) {
		newthread thread1 = new newthread();
		thread1.start();

		newthread thread2 = new newthread();
		thread2.start();
	}

}
