class Test 
{
	public static void main(String[] args)throws InterruptedException 
	{
		MyThread.mt=Thread.currrentThread();
		MyThread t=new MyThread();
		t.start();
		
		for(int i=0; i<=10;i++)
		{
			
			System.out.println("bikash main thread");
			Thread.sleep(1000);
		}

	}
}
class MyThread extends Thread
{
	static Thread mt; 
	public void run()
	{
		try
		{
			mt.join();
		}
		catch (InterruptedException e)
		{
		}
		for(int i=0;i<=10;i++)
		{
			System.out.println("i want to first position");	
			Ststem.out.println("and also second position");
		}
		
	}
}
