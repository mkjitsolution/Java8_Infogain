package p6;


 // static method ref
public class RefMethodCall {
	
	public static void abc()
	{
		System.out.println(" inside abc of RefMethodCall ");
	}
	
	public static void main(String[] args) {
		
		//Object a = abc();
		Addressable a =  RefMethodCall::abc;
		
		Company.doCall(a);
		
	}
	
	

}
