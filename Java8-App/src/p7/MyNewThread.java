package p7;

public class MyNewThread {
	
	public void doABC()
	{
		System.out.println(" do abc is called ");
	}
	
	
	public static void main(String[] args) {
		
		
		
		MyNewThread tt = new MyNewThread();
		
		Runnable r = tt::doABC;
		r.run();
		
	}

}
