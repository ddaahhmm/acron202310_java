package test1;

import java.io.PrintStream;

public class MainClass05 {

	public static void main(String[] args) {
		System.out.println();
		//System 클래스에는 out 이라는 static 필드가 존재하고 거기에는 콘솔창과 연결된 PrintStream type 객체의 참조값이 들어있음 
		PrintStream a = System.out; //static 필드 참조
		a.println("hello") ; //System.out.println("hello"); 와 같이 출력됨
		
		
		//system 클래스의 static 메소드 호출
		long ab = System.currentTimeMillis(); 
		
	}

}
