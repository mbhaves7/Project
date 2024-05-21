/*W.A.J.P to start the same Thread twice by calling start () method twice. Test
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); */

package Demo;

class ThreadTwice1 extends Thread {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getId()+" running");
			
			Thread.sleep(2000);
			System.out.println("\n"+Thread.currentThread().getId()+" complated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Q_45_TwiceThread {

	public static void main(String[] args) {

		try {
			ThreadTwice1 t1 = new ThreadTwice1();
			t1.start();
			t1.start();		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
