package Animal;
public class 토끼 extends 동물 {
    int toxic;

    public 토끼(){
    	this.이름 = "토깽이";
    	this.toxic = 100; 
    	this.set납치확률(80); //토끼 사냥확률을 80%
    	this.set구조확률(70); //토끼 사냥확률을 70%
    }

    public 토끼(String name){    	
    	//공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
    	this();
    	this.이름= name;
    }
    
    public 토끼(String name, int 사냥확률, int 구조확률){
    	//변수에 직접 대입하는 방식도 가능하고, 아래처럼 호출하는 것도 가능
    	this(name);
    	this.set납치확률(사냥확률);
    	this.set구조확률(구조확률);
    }
    public void 굴파기(){
    	System.out.println("토끼가 굴을 팝니다~");
    }

    public void 당근찾기(){
    	System.out.println("토끼가 당근을 찾습니다~");
    }

    public void 놀기(){
    	System.out.println("토끼가 숲속에서 놉니다~");
    	당근찾기();
    	굴파기();
    }
    
    public void 재주부리기(){
    	System.out.println("깡충깡충 높이 뛰기!!");
    	this.power += 1;
    	System.out.println("토끼의 근력이 1 증가했습니다 현재 : " + this.power);
    }

}
