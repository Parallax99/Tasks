package Task11to20.Task17;

public class ThreadSum extends Thread implements Runnable {
	private int start;
	private int stop;
	private static int sum;
	public ThreadSum(int start,int stop) {
		this.start = start;
		this.stop = stop;
		this.sum=0;
	}
	public static void setSum(int sum) {
		ThreadSum.sum = sum;
	}
	public void run() {
		for(int i=start;i<=stop;i++) {
			sum+=i;
			System.out.println(i);
		}
	//	System.out.println("Sum---->"+getSum());
		
	}
//	public static void printSum() {
//		System.out.println("Sum---->"+getSum());
//	}
 public static void main(String[] args) throws InterruptedException {
	ThreadSum t = new ThreadSum(1,50);
	ThreadSum t1 = new ThreadSum(51,100);
//	String s = Thread.currentThread().getName();
//	System.out.println(s);
	Thread t2 = Thread.currentThread();
	t.start();
	System.out.println();t.isAlive();
	synchronized (t) {
		t.wait();	
	}
//	t.getSum();
	t1.start();
	synchronized (t1) {
		t1.wait();
	}
	//Thread.sleep(10);
//	t1.wait(10);
//	t.wait();
//	t2.setPriority(MIN_PRIORITY);
//	t.setPriority(MAX_PRIORITY);
//	t1.setPriority(NORM_PRIORITY);
	synchronized (t) {
		t.notify();
	}
	synchronized (t1) {
		t1.notify();	
	}
	System.out.println(getSum());
//	System.out.println(t.getSum());
//	System.out.println("Sum--->"+);
	
	
}
public static  int getSum() {
	return sum;
}
}
