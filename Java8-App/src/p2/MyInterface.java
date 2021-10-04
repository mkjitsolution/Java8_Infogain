package p2;

public interface MyInterface {

	public void a1();
	public float a2(String x,int b);
}

// approach 1
class Hello implements MyInterface
{

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float a2(String x, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

// approach 2
class Demo 
{
	
     public void doa1Task()
     {
    	 MyInterface obj = new MyInterface()
    	 {
    		 
    		 @Override
    			public void a1() {
    				System.out.println("sdgvsdgfw");
    				
    			}

    			@Override
    			public float a2(String x, int b) {
    				// TODO Auto-generated method stub
    				return 2.5f;
    			}
    	 };
    	 
    	 obj.a1();
    	 float result = obj.a2("dwfds", 5);
     }

}

class Hello2
{

	public static void main(String[] args) {
		Demo d = new Demo();
		d.doa1Task();
	}
}












