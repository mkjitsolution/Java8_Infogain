package p3;

import java.io.File;

public class MobilePhone {

	public void doShareFiles(String filePath) {
		// lambdaApproach1(filePath);
		approach4();
	}// end of doShare

	public void lambdaApproach1(String filePath) {
		// approach 1 - no need to call method name
		Bluetooth b1 = (String filename) -> {
			// 100 lines of code to share file
			return "Sharing file " + filename;
		};

		if (filePath != null) {
			// verify the file in Harddisk
			File f = new File(filePath);
			if (f.exists()) {
				String msg = b1.shareFile(filePath);
				System.out.println(msg);
			}

		}
	}// end of lambda - approach 1

	public void lambdaApproach2(String filepath) {
		// No need to pass datatype name
		Bluetooth b1 = (filename) -> {
			// 100 lines of code to share file
			return "Sharing file " + filename;
		};

		String abc = b1.shareFile("dfcd");
		System.out.println(abc);
	}

	public void approach3() { 
		// note :- only applicable in single line implementation
	   Bluetooth b1 = (f)-> "Sharing file " + f; 
	  
	}

	public void approach4() {
		System.out.println(" inside A");
		Bluetooth b1 = f -> "Sharing file " + f;
		String msg = b1.shareFile("MyNewApproach4File");
		System.out.println(msg);
	}

}



















