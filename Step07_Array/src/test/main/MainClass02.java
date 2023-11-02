package test.main;

public class MainClass02 {

	public static void main(String[] args) {
		// 0으로 초기화된 int[] 객체 만들어 참조값 지역변수 nums에 담기
		
		int [] nums = {0,0,0} ;
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		//0으로 초기화된 방 500개짜리 객체 만들어 참조값 지역변수 num2에 담기
		
		int[]  num2 = new int [500]; //개수만 정해지고 내용없는 배열 선언 
		System.out.println(num2[0]);
		
		
		for(int i = 0 ; i<num2.length ; i++) {
			num2[i] = i+1;
		}
	}

}
