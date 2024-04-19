package Week7;

public class 메소드오버로딩 {
	//메인 메소드에는 static을 붙여놓읍시다...
	public static void main(String[] args)
	{
		Plus p = new Plus();
		
		int intResult = p.plus(10, 20);
		double doubleResult = p.plus(10.0, 20.0);
		double testResult = p.plus(10, 20.0);
		//에러뜸
		//int testResult = p.plus(10, 10.0);
		
		System.out.println(intResult);
		System.out.println(doubleResult);
		System.out.println(testResult);
	}
	
	//메소드는 제발 메인 메소드 밖에.............

}
