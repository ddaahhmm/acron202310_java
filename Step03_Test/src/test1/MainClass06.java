package test1;

public class MainClass06 {
	//static 메소드에서 사용하는 필드는 static 필드로 만들어야 사용 할 수 있음
	static int num = 999;
	
	public static void main(String[] args) {
		int result = num+1;   //main() 메소드와 num 이라는 필드는 동일한 클래스의 멤버이기 때문에 MainClass06. 은 생략 가능
		System.out.println(result);
	}
	
	//method
	static public void test() {
		
	}
}
