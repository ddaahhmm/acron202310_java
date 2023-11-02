package test.main;

import java.util.Scanner;

public class MainClass06 {

	public static void main(String[] args) {
		/* 문자열을 저장할 수 있는 방 5개짜리 배열 객체 생성해서 참조값을 msgs 라는 지역변수 담기
		키보드로부터 입력받을수 있는 Scanner 객체를 생성해 참조값을 scan이라는 지역변수 담기
		반복문을 위에서 생성한 배열의 방 갯수만큼 돌면서 키보드로부터 문자열 입력받아 배열에 순서대로 저장
		 반복문 돌면서 배열에 저장되었던 모든 문자열 순서대로 콘솔창에 출력
		*/
		
		String[] msgs = new String[5];
		Scanner scan = new Scanner(System.in); 
		
		for(int i=0; i<msgs.length; i++) {
			System.out.println("Input : ");
			msgs[i] = scan.nextLine();
 		}
		for(int i = 0; i<msgs.length; i++) {
			System.out.println(msgs[i]);
		}
		
		
	}

}
