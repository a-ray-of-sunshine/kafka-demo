package test;

/**
 * 如果线程是用户线程，则即使主线程退出了，启动的子线程也不会自动退出，直到子线程的代码执行完毕才会退出
 * @author Administrator
 *
 */
public class ThreadTest {

	public static void main(String[] args) {
		
	Thread thread = new Thread(new MyThread()); 
	thread.setDaemon(false);
	thread.start();
	System.out.println("main go.");
	}

}

class MyThread implements Runnable{

	long count;

	@Override
	public void run() {
		while (true) {
		System.out.println("message: " + count++);
		}
	}
	
}
