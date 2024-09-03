package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task extends Thread{
	
	private int number;
	public Task(int number)
	{
		this.number=number;
	}
	
	public void run()
	{
		System.out.println("Task"+" "+number+"KickedOff");
		for(int i=number*100;i<number*100+99;i++)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("Task"+number+"Ended");
	}
}
public class ExeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ExecutorService ex = Executors.newSingleThreadExecutor();
//		
//		ex.execute(new t1());
//		ex.execute(new Thread(new t2()));
		
		ExecutorService ex2= Executors.newFixedThreadPool(3);
		ex2.execute(new Task(1));ex2.execute(new Task(2));
		ex2.execute(new Task(3));ex2.execute(new Task(4));ex2.execute(new Task(5));
		
		ex2.shutdown();
		
		
	}

}
