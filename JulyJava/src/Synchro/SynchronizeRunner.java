package Synchro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizeRunner {
	private int i=10;
	private int k=10;
	private AtomicInteger at = new AtomicInteger();
	//Atomic integers are thread safe compare to normal integers
	

	synchronized public void IncrementI()
	{
		this.i++;
		at.incrementAndGet();
	}
	public void getI()
	{
		System.out.println(this.i);
	}
	synchronized public void IncrementK()
	{
		this.k++;
	}
	public void getK()
	{
		System.out.println(this.k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService ex2= Executors.newFixedThreadPool(2);
		Lock t1 = new ReentrantLock();
		
		Lock t2 = new ReentrantLock();
		
		//even we have setted the executorservice thread pool as it will only execute 1 thread at due to having keyword synchronized in method
		//as we know if we use synchronized keyword it will stop the other thread until completion of running thread even though it doesnt have any dependecy
		//to overcome this issue in java 7 we got an a new update service as ReEntrantLock
		//if we ReentrantLock it will only applicable for specific method so other thread can run parallely
		//Example
//		public void run1()
//		{
//			t1.lock();
//			
//			10++;
//			t1.unlock();
//		}
//		public void run2()
//		{
//			t2.lock();
//			
//			10++;
//			t2.unlock();
//		}
//		So now lock will start once the execution completes it will unlock it
		
		 
		//ex2.execute((Runnable) new SynchronizeRunner());

	}

}
