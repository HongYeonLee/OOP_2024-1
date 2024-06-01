public class Course {
    String 이름;
    String 학생유형;
    
    public Course() {
    	
    }
    
    public Course(String 이름, String 학생유형) {
    	this.이름 = 이름;
    	this.학생유형 = 학생유형;
    }
    
    public void showInfo(){
    	System.out.println("===========================");
    	System.out.println("과목이름 : " + 이름);
    	System.out.println("학생유형 : " + 학생유형);
    }

}
