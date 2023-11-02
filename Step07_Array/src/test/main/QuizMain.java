package test.main;

import java.util.Random;

public class QuizMain {

	public static void main(String[] args) {
		// run 했을때 cherry, apple, banana, melon, 7 ->  5 개의 문자열 중에 1개가 랜덤하게 출력
		
		String[] str = {"cherry", "apple", "banana", "melon", "7"};
		
		Random r1 = new Random();
		int a = r1.nextInt(str.length );
		
		
		System.out.println(str[a]);
		}

}
