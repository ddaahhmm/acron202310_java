package test.main;

public class MainClass01 {

	public static void main(String[] args) {
		/*
		 *  [ Java 기본 데이터 type ]
		 *  
		 *  1. 숫자형
		 *  
		 *  정수형 : byte, short, int, long
		 *  
		 *  - byte 변수명;  // -128 ~ 127
		 *  - short 변수명;  // -32768 ~ 32767
		 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
		 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
		 *  
		 *  실수형 : float, double
		 *  
		 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
		 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
		 */
		System.out.println("main method start ");
		byte a = 1;
		short b = 3;
		int c = 5;
		long d = 7;
		float e = (float)2.5;
		double f = 10.7;
		
		int tmp = a; // int에 byte 넣음
		byte tmp2 = (byte)a; // byte에 int넣지만 작아서 허용됨 단, 작은게 확실할때 사용 (type) : casting 연산자
		
		float num1= 10.1f;
		double num2 = 10.2d;
		double num3 = 10.3;
		
		double tmp3 = num1;
		float tmp4 = (float)num2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(tmp);
		System.out.println(tmp2);
		
	}

}
