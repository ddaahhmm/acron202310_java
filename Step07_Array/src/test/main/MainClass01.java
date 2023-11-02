package test.main;

public class MainClass01 {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6}; // 배열은 참조 data type임 
		
		System.out.println(nums[0]);
		//double type 5개를 저장하고 있는 배열 객체를 생성해 참조값을num2라는 지역 변수에 담음
		
		double[] num2 = {1.1,2.2,3.3,4.4,5.5};
		System.out.println(num2[0]);
		
		boolean[] truth = {true,true,false,false,true};
		
		String[] str = {"Hello", "My", "Name","Is"};
		
		System.out.println(truth[0]);
		System.out.println(str[0]);
		
		int[] result1 = nums.clone(); //똑같은 모양/형식의 객체(배열) 생성 단, 참조값은 다름 
		int[] result2 = nums; //얘는 참조값까지 같음 변수 안에 똑같은 객체가 들어감 
		
		System.out.println(result1[0]);
		System.out.println(result2[0]);
		
		//배열의 크기 얻어내기
		int size = nums.length;
		int first = nums[0];
		int second = nums[1];
		int thrid = nums[2];
	}

}
