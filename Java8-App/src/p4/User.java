package p4;


interface Battery {

	default public int provideBackup(int maxpower,int abc)
	{
		return 150;
	}
	default public int provideBackup2(int maxpower,int abc)
	{
		return 8888;
	}
	
	static public void doThings(int a ,int b)
	{
		System.out.println("interface static method "+(a+b));
	}
	
}

class Device implements Battery
{

	@Override
	public int provideBackup(int maxpower, int abc) {
		return 1000;
	}
	
}


public class User
{
	public static void main(String[] args) {
		Device d1 = new Device();
		
		int x = d1.provideBackup(1, 1);
		System.out.println(x); // 1000
		
		int y = d1.provideBackup2(45, 44);
		System.out.println(y); // 8888
		
		
		//d1.doThings();
		//Device.doThings();
		Battery.doThings(55,66);
	}
}
