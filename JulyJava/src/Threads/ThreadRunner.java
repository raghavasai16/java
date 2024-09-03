package Threads;
class t1 extends Thread
{
	public void run()
	{
		System.out.println("task1");
		for(int i=10;i<30;i++)
		{
			
			System.out.print(i+"\t");
		}
		System.out.println("task1 Ended");
	}
}

class t2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("task2");
		for(int i=30;i<50;i++)
		{
			
			System.out.print(i+"\t");
		}
		System.out.println("task2 ended");
	}
	
}



public class ThreadRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("task1");
//		for(int i=10;i<30;i++)
//		{
//			
//			System.out.print(i+"\t");
//		}
		
		System.out.println("task3");
		for(int i=50;i<70;i++)
		{
			
			System.out.print(i+"\t");
		}
		
//		task1
//		10	11	12	13	14	15	16	17	18	19	20	21	22	23	24	25	26	27	28	29	task2
//		30	31	32	33	34	35	36	37	38	39	40	41	42	43	44	45	46	47	48	49	task3
//		50	51	52	53	54	55	56	57	58	59	60	61	62	63	64	65	66	67	68	69	
		
		//if we see above output to initiate the 2nd task it is waiting until completion of task1
		//Even though our CPU has more utilization it is not occupied properly
		//To make our CPU utilization we can run the parallel by using thread concepts
		
		t1 task1 = new t1();
		task1.start();
		
		t2 task2= new t2();
		Thread thread= new Thread(task2);
		thread.start();
		
		
		
		

	}

}
