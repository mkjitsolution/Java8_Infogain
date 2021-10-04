package p3;

public class User {

	public static void main(String[] args) {
		
		/* Not good approach, but valid
		Bluetooth b = new Bluetooth() {
			
			@Override
			public String shareFile(String path) {
				// TODO Auto-generated method stub
				return null;
			}
		}; 
		
		b.shareFile("MyMusicFile.mp3");
		*/
		// -----------------------------
		
		
		  Laptop dell = new Laptop(); dell.doSharing("MyMusicFile.mp3");
		 
		
	new MobilePhone().doShareFiles("");	
		
		
		
	}
}










