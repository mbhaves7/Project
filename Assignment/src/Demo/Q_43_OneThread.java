package Demo;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread is running: " + i);
			try {
				// Adding a short delay
				Thread.sleep(1000); // Sleep for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Q_43_OneThread {

	public static void main(String[] args) {
		// Creating an instance of MyThread
		MyThread t = new MyThread();
		// Starting the thread
		t.start();
	}

}
