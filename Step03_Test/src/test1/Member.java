package test1;

public class Member {


		//member 객체 하나의 회원의 번호,이름,주소를 담기 위해 Member 클래스 설계
		public int num;
		public String name;
		public String addr;
		
		public void showInfo() { //this 는 참조값을 가리킨다. this.은 생략 가능 
			String info = "번호는  " + this.num +" 이고, 이름은 " + this.name+"이고, 주소는 "+ this.addr + "입니다.";
			System.out.println(info);
			
			Member a = this; // this를 변수에 넣을려면 자기자신 클래스명 타입 + 변수명 
		}

}
