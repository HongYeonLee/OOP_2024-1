package Animal;
public class 강아지 extends 동물 {
	
	//디폴트생성자
    public 강아지(){
    	this.이름 = "강아지"; //이름없이 받았을 때는 기본 이름은 강아지가 됨
    	this.set납치확률(50);  //강아지 납치률을 50%
    	this.set구조확률(70); //강아지 구조률을 70%
    }

    public 강아지(String name){    	
    	//공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
    	//super(name) -> 동물 클래스에서 public 동물 (String 이름) 생성자 호출
    	this(); //동물 클래스에서 public 동물() 생성자 호출 -> 강아지() 호출 -> 강아지(String name) 
    	this.이름 = name;
    }
    
    public 강아지(String name, int 납치확률, int 구조확률){
    	//변수에 직접 대입하는 방식도 가능하고, 아래처럼 호출하는 것도 가능
    	this(name);
    	this.set납치확률(납치확률);
    	this.set구조확률(구조확률);
    }
    
    public void 움직이기(){
    	
    }

    public void 놀기(){
    	System.out.println("강아지가 숲속에서 뛰어나니며 놉니다 멍멍멍~");
    	인형물어뜯기();
    	신발물고도망가기();
    
    }
    public void 공부하기(){    	
    
    }
    
    public void 인형물어뜯기(){
    	System.out.println("인형을 물어뜯어볼까? 멍멍~");
    }

    public void 신발물고도망가기(){
    	System.out.println("신발을 물고 도망을 가볼까? 멍멍~");
    }
    
    //동물원에서
    public void 재주부리기(){
    	System.out.println("멍멍...멍멍....나는 재주를 부리는 강아지 ");
    	System.out.println("열심히 일해서 돈도 벌고 근력도 길러서 탈출을 시도해야지!");
    	this.power+=10;
      }

    

}
