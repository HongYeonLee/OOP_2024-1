package 소융창;

public class 사이버캠퍼스시스템 {
	public static void main(String[] args)
	{
		사이버캠퍼스접속();
		로그인();
		while(학생정보읽기() != "일치")
			로그인();
		해당교과목메뉴입장();
		if(과제물확인() == "과제를했다")
		{
			과제함에제출();
			과제물저장();
			로그아웃();
			return;
		}
		else
		{
			로그아웃();
			return;
		}	
	}
	private static void 사이버캠퍼스접속() {
		// TODO Auto-generated method stub
		System.out.println("사캠에 접속한다");
	}
	private static void 로그인() {
		// TODO Auto-generated method stub
		System.out.println("로그인한다");
	}
	private static String 학생정보읽기() {
		// TODO Auto-generated method stub
		System.out.println("학생정보를 읽는다");
		return "일치";
	}
	private static void 해당교과목메뉴입장() {
		// TODO Auto-generated method stub
		System.out.println("해당교과목에 입장한다");
	}
	private static String 과제물확인() {
		// TODO Auto-generated method stub
		System.out.println("과제물을 확인한다");
		return "과제를했다";
	}
	private static void 과제함에제출() {
		// TODO Auto-generated method stub
		System.out.println("과제물을 제출한다");
	}
	private static void 과제물저장() {
		// TODO Auto-generated method stub
		System.out.println("해당 과제물을 저장한다");
	}
	private static void 로그아웃() {
		// TODO Auto-generated method stub
		System.out.println("로그아웃한다");
	}
}
