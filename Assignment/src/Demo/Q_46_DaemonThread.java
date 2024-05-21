/*W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
Daemon () method of Thread class and check whether the thread is set daemon or
not by using is Daemon () method.
TestDaemonThread2 t1=new TestDaemonThread2();
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
t1.setDaemon(true);//will throw exception here t2.start(); */

package Demo;

class TestDaemonThread2 extends Thread {

	public void run() {

		if (Thread.currentThread().isDaemon()) {

			System.out.println(getId() + " is Daemon thread");

		} else {
			System.out.println(getId() + " is user thread");
		}

	}
}

public class Q_46_DaemonThread {

	public static void main(String[] args) {

		try {
			TestDaemonThread2 t1 = new TestDaemonThread2();
			t1.setDaemon(true);
			t1.start();

			TestDaemonThread2 t2 = new TestDaemonThread2();
			t2.start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
