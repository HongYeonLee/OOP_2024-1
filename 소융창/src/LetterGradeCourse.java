public class LetterGradeCourse extends Course {
    int 출석점수;
    int 중간고사;
    int 기말고사;
    int 과제점수;
    
    public LetterGradeCourse() {
    	
    }
    
    public LetterGradeCourse(int 출석점수, int 중간고사, int 기말고사, int 과제점수) {
    	super("소프트웨어융합창의설계", "재학생");
    	this.출석점수 = 출석점수;
    	this.중간고사 = 중간고사;
    	this.기말고사 = 기말고사;
    	this.과제점수 = 과제점수;
    }
    
    
    public int get출석점수(){
        return 출석점수;
    }

    public int get중간고사(){
        return 중간고사;
    }

    public int get기말고사(){
        return 기말고사;
    }

    public int get과제점수(){
        return 과제점수;
    }

    public double get총점(){
        
    	double 총점 = get출석점수()*0.2 + get중간고사()*0.3 + get기말고사()*0.3 + get과제점수()*0.2;
    	return 총점;
    }

    public char get학점(){
    	
    	double 총점 = get총점();
    	char 학점 = ' ';
    	
    	if (총점 >= 90)
    		학점 = 'A';
    	else if (총점 >= 80)
    		학점 = 'B';
    	else if (총점 >= 70)
    		학점 = 'C';
    	else
    		학점 = 'F';
    	
        return 학점;
    }

    public void showInfo(){
    	super.showInfo();
    	System.out.println("출 석 : " + get출석점수());
    	System.out.println("중 간 : " + get중간고사());
    	System.out.println("기 말 : " + get기말고사());
    	System.out.println("과 제 : " + get과제점수());
    	System.out.println("총 점 : " + get총점());
    	System.out.println("---------------------------");
    	System.out.println("학점 : " + get학점());
    	System.out.println("===========================");
    }

}
