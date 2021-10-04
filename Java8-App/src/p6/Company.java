package p6;

public class Company {
	public static void doCall(Addressable a) {
		System.out.println(" logging done ");
		System.out.println(" Security verified ");
		a.doSomeThing();
		
		System.out.println(" exit logs done ");
	
	}
	
}
