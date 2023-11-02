package test.main;

public class MainClass05 {

	public static void main(String[] args) {
		/*
		 * [JAVA 참조 데이터 type]
		 * String type
		 * -문자열 데이터 
		 */
		
		String a = "hello";
		System.out.println(a);
		String tmp = a;
		a = "nonono";
		a = null;
		System.out.println(a);
	}

}
