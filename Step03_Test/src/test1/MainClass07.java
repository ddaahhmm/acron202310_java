package test1;

public class MainClass07 {

	public static void main(String[] args) {
		//Member 클래스로 객체를 생성하고 참조값을 mem1 이라는 지역 변수에 담기
		
		Member mem1 = new Member();
		mem1.num = 1;
		mem1.name = "AAA";
		mem1.addr = "AAA - AAA - AAA";
		
		Member mem2 = new Member();
		mem2.num = 2;
		mem2.name = "BBB";
		mem2.addr = "BBB - BBB - BBB";
		
		mem1.showInfo();
		mem2.showInfo();
		
	}

}
