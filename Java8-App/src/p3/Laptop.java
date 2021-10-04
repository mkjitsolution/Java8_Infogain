package p3;

import java.io.File;
import java.io.FileWriter;

public class Laptop  {
	
	public void doSharing(String filePath)
	{
		Bluetooth bv5 = new Bluetooth() {
			
			@Override
			public String shareFile(String path) {
				// code to share file through bluetooth
				return "Started sharing file "+path;
			}
		}; 
		
		if(filePath != null)
		{
			// verify the file in Harddisk
			File f = new File(filePath);
			if(f.exists())
			{
				bv5.shareFile(filePath);
			}
			
		}
		
		
	}
	
	public void doProcessing()
	{
		
	}
	
	public void startCamera()
	{
		
	}
	
	public void doPlayGames()
	{
		
	}
	
	public void doCoding()
	{
		
		
	}

	public void startBrowser()
	{
		
	}
}
