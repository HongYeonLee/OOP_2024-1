

import java.util.Scanner;

public class EZmain {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		int menu;
		
		System.out.print("1. 재학생 | 2. 외부인 선택하세요 : ");
		int type = scanner.nextInt();
		if (type == 1) {
			Student student1 = new Student();
			
			//재학생 회원가입
			student1.setUserName("이화연");
			student1.setUserID("ewha");
			student1.setUserPassWord("abcd1234");
			student1.setStudentID("231111");
			
			//재학생 로그인 및 사용자 정보 보기
			student1.login("ewha", "abcd1234");
			student1.showUserInfo();
		} else if (type == 2) {
			Outsider outsider1 = new Outsider();
			
			//외부인 회원가입
			outsider1.setUserName("이지연");
			outsider1.setUserID("ewha");
			outsider1.setUserPassWord("qwer1234");
			outsider1.setPhoneNum("010-1234-5678");
			
			//외부인 로그인 및 사용자 정보 보기
			outsider1.login("ewha", "qwer1234");
			outsider1.showUserInfo();
		}
			
		while (true) {
			do {
				System.out.println("===========메뉴==========");
				System.out.println("1. 셔틀 위치 확인하기");
				System.out.println("2. 엘리베이터 혼잡도 확인하기");
				System.out.println("3. 최적 경로 찾기");
				System.out.println("4. 즐겨찾는 경로");
				System.out.println("5. 로그아웃");
				System.out.println("========================");
				System.out.print("menu : ");
				
				menu = scanner.nextInt();
			} while (menu <1 || menu > 5);
			
			if (menu == 5) {
				System.out.println("로그아웃합니다.");
				break;
			}
		
			switch (menu) {
			case 1: //셔틀 위치 확인하기
				ShuttleLocation shuttleLocation = new ShuttleLocation();
				System.out.print("버스 번호를 입력하세요 (1, 2, 3) : ");
				shuttleLocation.setBusID(scanner.nextInt());
				shuttleLocation.showLocation();
				break;
				
			case 2: //엘레베이터 혼잡도 확인하기
				ElevatorStatus elevatorStatus = new ElevatorStatus();
				System.out.println("엘리베이터 (포스코관, 종합과학관, 학생문화관)");
				System.out.print("엘리베이터의 위치를 입력하세요 : ");
				elevatorStatus.setElevID(scanner.next());
				elevatorStatus.showStatus();
				break;
				
			case 3: //최적 경로 찾기
				OptimalRoute optimalRoute = new OptimalRoute();
				System.out.print("출발지를 입력하세요 : ");
				optimalRoute.setStartingPoint(scanner.next());
				System.out.print("목적지를 입력하세요 : ");
				optimalRoute.setDestination(scanner.next());
				optimalRoute.selectOption();
				optimalRoute.findRoute();
				optimalRoute.showRoute();
				break;
				
			case 4: //즐겨찾는 경로
				FavoriteRoutes favoriteRoutes = new FavoriteRoutes();
				//즐겨찾는 경로 배열 입력?
				favoriteRoutes.selectFavoriteRoute();
				favoriteRoutes.showRoute();
				break;
				
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
				
			} //end switch~case
		} //end while
		scanner.close();
	} //end main

} //end class
