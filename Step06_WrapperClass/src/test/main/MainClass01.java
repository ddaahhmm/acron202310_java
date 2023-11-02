package test.main;

public class MainClass01 {

	public static void main(String[] args) {
			//기본 데이터 type 지역변수 num1
		int num1 =10;
		//참조 데이터 type 지역변수 num2
		//Integer num2 = new Integer(10); 
		Integer num2 = 10; //객체형이기 때문에 num2.method 존재 
		
		int result1 =num2+1; //11
		int result2 = num1+num2; //20
		Integer result3 = num1+num2; // id값 
		
		String result4 = num2.toString(); //정수 10을 문자열 10으로 변환하여 리턴
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		int result5 = Integer.parseInt("999"); //문자열을 정수로 바꿈 
		
	}

}

/*
 * 기본 data type				기본 data type 의 객체형
 * byte								Byte
 * short							Short
 * int								Integer
 * long								Long
 * 
 * float								Float
 * double							Double
 * 
 * boolean						Boolean
 * char								Character
 * 
 * -때로는 기본데이터 type의 참조데이터 type이 필요할 때가 있다.
 * -기본 데이터 type을 객체에 포장하는 형태
 * -boxing 과 unboxing은 자동으로 되기 때문에 신경 X*/
 