package test.main;

import test.mypac.Member;

public class MainClass02 {

	public static void main(String[] args) {
		Member m1 = new Member(1, "AAA", "AAA-AAA-AAA");
		Member m2 = new Member( );
		m2.num = 2;
		m2.name = "BBB";
		m2.addr="BBB-BBB-BBB";
		m2.printInfo();
		
		System.out.println(m1.name); //m1의 name에 자동으로 저장 X  -> Member Class에서 this로 지명해 줘야함 
	}
	


}
