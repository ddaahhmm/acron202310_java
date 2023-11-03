package test.main;

import test.mypac.Remocon;

public class MainClass01 {

	public static void main(String[] args) {
		/*Interface 도 date type의 역할 
		 * */
		
		Remocon r1 = null; //Remocon r1 = new Remocon() 은 성립 X 
		//Remocon r1 = new MyRemocon();
		r1.down();
		r1.up();
		//Remocon 인터페이스에 정의된 static final 상수
		String result = Remocon.COMPANY; //인터페이스명.필드명 으로 참조 가능 
		
		//변수는 필요시에 값 변경 가능
		int num = 10;
		num = 20;
		
		//상수는 값 변경 불가
		final int num2 = 10;
		//num2 = 20; 
		
		final String NICK = "AAA";
	
	}

}
