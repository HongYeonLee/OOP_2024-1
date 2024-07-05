

import java.util.Scanner;

public class FavoriteRoutes extends EZ {
    public String[] favoriteRoutes = {"정문-한우리집", "정문-종합과학관", "포스코관-아산공학관"};
    private String selectedRoute;
    
    public FavoriteRoutes() { //기본생성자, 컴파일에러 방지
    	
    }
    
	public void setSelectedRoute(String selectedRoute) {
		this.selectedRoute = selectedRoute;
	}
	
    public String getSelectedRoute() {
		return selectedRoute;
	}

    public void selectFavoriteRoute(){ //void로 수정, 매개변수 일단 지움
    		System.out.println("----즐겨찾는 경로----");
        	for (int i = 1; i<=favoriteRoutes.length; i++) {
            	System.out.println(i + ". " + favoriteRoutes[i-1]);
        	}
        	System.out.println("-----------------");
        	
        	System.out.print("경로를 선택하세요 : ");
        	int index = scanner.nextInt();
        	setSelectedRoute(favoriteRoutes[index-1]);
    }
    
	public void showRoute() throws InterruptedException{//매개변수 없음으로 바꿈
    	System.out.println("선택한 경로 : " + getSelectedRoute());
    	System.out.println("경로 검색 결과");
    	Thread.sleep(1000);
    	System.out.println("정문에서 셔틀버스에 승차합니다");
    	Thread.sleep(1000);
    	System.out.println("공대삼거리역에서 하차합니다");
    	Thread.sleep(1000);
    	System.out.println("종합과학관 현대자동차동에 도착했습니다");
    	Thread.sleep(1000);
    }

}
