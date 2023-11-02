package test;

public class MainClass06 {

	public static void main(String[] args) {
		
		boolean isWait = false;
		String result = isWait ? "Wait" : "Do Not Wait";
		System.out.println(result);
		
		String result2 = null;
		if(isWait) {
			result2="Wait";
		 }else {
			 result2 = "Do Not Wait";
		 }
		
		System.out.println(result2);
		
		
	}

}
