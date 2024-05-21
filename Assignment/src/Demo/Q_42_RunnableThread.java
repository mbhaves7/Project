/*W.A.J. P to create one thread by implementing Runnable interface in Class. */

package Demo;

class MyRunnable implements Runnable {
	public void run() {
		// Logic inside the run method represents the task to be executed by the thread
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				// Adding a short delay to simulate some processing
				Thread.sleep(1000); // Sleep for 1 second
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted.");
			}
		}
		System.out.println("thread complete");
	}
}

public class Q_42_RunnableThread {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		// Starting the thread
		thread.start();

	}
}
