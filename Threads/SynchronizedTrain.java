class Reserve implements Runnable
{
	int available =1;
	int need;	

	Reserve(int i)
	{
	need = i;
	}
	
	public void run()
	{
		
	synchronized(this) 
	{
		
		System.out.println("Available berths  = " + available);

		
		if (available >= need)
		{	
			String name = Thread.currentThread().getName();		
			System.out.println(need + " Berth reserved for  " + name);
			try
			{
			Thread.sleep(1000); 
			available = available - need;
			}
			catch(InterruptedException ie)
			{
			//ie.printStackTrace();
			}
		}
		
		// if available berths are less, display sorry
		else System.out.println(" Berths are not available \nSorry for the inconvenience");
	} 
	}
}

class SynchronizedTrain
{
public static void main(String args[])
{
Reserve obj = new Reserve(1);
Thread t1 = new Thread(obj);
Thread t2 = new Thread (obj);
t1.setName("Priya");
t2.setName("Sai");
t1.start();
t2.start();

}
}
