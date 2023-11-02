package test.main;

import java.util.Random;

public class MainClass04 {

	public static void main(String[] args) {
		Random r1 =new Random(); 
		int a = r1.nextInt();
		int b = r1.nextInt(0, 10);
		int c = r1.nextInt(10);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
