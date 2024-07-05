

import java.util.Scanner;

public class OptimalRoute extends EZ {
    private String startingPoint;
    private String destination;
    public String[] options = {"최단 시간", "최소 도보", "베리어프리"};
    private String selectedOption;
    public String route;
    
    public OptimalRoute() { //기본생성자, 컴파일에러 방지
    	
    }
    
    public void setStartingPoint(String startPoint){
    	this.startingPoint = startPoint;
    }

    public String getStartingPoint(){
        return startingPoint;
    }

    public void setDestination(String destination){
    	this.destination = destination;
    }

    public String getDestination(){
        return destination;
    }
    
	public void setSelectedOption(String selectedOption) {
		this.selectedOption = selectedOption;
	}
	
    public String getSelectedOption() {
		return selectedOption;
	}

    public void selectOption(){
    	System.out.println("---옵션---");
    	for(String option : options) {
    		System.out.println(" " + option);
    	}
    	System.out.println("---------");
    	
    	System.out.print("옵션을 선택하세요 : ");
    	setSelectedOption(scanner.nextLine());
    }

	public void findRoute(){ //매개변수 지움
    	System.out.println(getStartingPoint() + "에서 " + getDestination() + "까지 " + getSelectedOption() + " 경로 검색 중");

    }

    public void showRoute() throws InterruptedException{ //매개변수 지움
    	System.out.println("경로 검색 결과");
    	Thread.sleep(1000);
    	System.out.println(getStartingPoint() + "에서 엘리베이터로 4층 이동 후 종합과학관으로 이동합니다");
    	Thread.sleep(1000);
    	System.out.println("종합과학관에서 엘리베이터로 4층 이동후 종합과학관 현대자동차동으로 이동합니다");
    	Thread.sleep(1000);
    	System.out.println("종학과학관 현대자동차동에서 엘리베이터로 3층 이동 후 " + getDestination() + "까지 도보로 이동합니다");
    	Thread.sleep(1000);
    	System.out.println(getDestination() + "에 도착하였습니다");
    	Thread.sleep(1000);
    }

}
