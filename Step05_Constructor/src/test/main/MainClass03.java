package test.main;

import test.mypac.Cpu;
import test.mypac.Memory;
import test.mypac.HardDisk;
import test.mypac.MacBook;

public class MainClass03 {

	public static void main(String[] args) {
		/*MacBook 객체를 생성해서 참조값을 mac1이라는 지역변수에 담기
		 * 
		 * 주의
		 * -MacBook 클래스 절대 수정 x
		 * - MainClass03은 test.main 패키지에 있고 Cpu,Memory,HardDisk,MackBook class는 test.mypac 에 있기 때문에 4개클래스 모두 import
		 * */
		MacBook mac1 =new MacBook(new Cpu(), new Memory(), new HardDisk());
		// 생성자의 매개변수에 전달할 값을 직접 생성해서 전달
		
		Cpu c1 = new Cpu();
		Memory m1 = new Memory();
		HardDisk h1 = new HardDisk();
		//생성자의 매개변수에 전달할 값이 지역변수에 저장되어 있으면 지역변수 명으로 전달 가능
		MacBook mac2 =new MacBook(c1,m1,h1);
		
	}

}
