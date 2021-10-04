package s1;

import java.util.Random;

public class Dump {

	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 100 ; i++) {
			int x = random.nextInt(200);
			System.out.print(x+"   ");
		}
		

	}

}
