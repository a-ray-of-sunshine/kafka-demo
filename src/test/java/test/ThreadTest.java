package test;

/**
 * ����߳����û��̣߳���ʹ���߳��˳��ˣ����������߳�Ҳ�����Զ��˳���ֱ�����̵߳Ĵ���ִ����ϲŻ��˳�
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
