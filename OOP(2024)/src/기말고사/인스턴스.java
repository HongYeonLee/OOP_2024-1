package 기말고사;

class 하늘 {
	private static 하늘 instance = null; //static 붙이기
	
	private 하늘() {
		System.out.println("하늘을 생성합니다");
	}
	
	public static 하늘 getInstace() { //static 붙이기
		if (instance == null) instance = new 하늘();
		return instance;
	}
}

public class 인스턴스 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		하늘 sky1 = 하늘.getInstace();
		하늘 sky2 = 하늘.getInstace();
		
		System.out.println(sky1);
		System.out.println(sky2);
	}

}
