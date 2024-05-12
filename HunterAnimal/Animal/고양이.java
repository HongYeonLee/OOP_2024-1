package Animal;
public class 고양이 extends 동물 {
    public int 수염;

    public 고양이(){
    	this.이름 = "고양이";
    	this.set납치확률(40); //고양이 사냥확률을 40%
    	this.set구조확률(30); //고양이 구조확률을 30%
    }

    public 고양이(String name){    	
    	//공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
    	this();
    	this.이름 = name;
    }
    
    public 고양이(String name, int 사냥확률, int 구조확률){
    	//변수에 직접 대입하는 방식도 가능하고, 아래처럼 호출하는 것도 가능
    	this(name);
    	this.set납치확률(사냥확률);
    	this.set구조확률(구조확률);
    }
    public void 사냥하기(){
    	System.out.println("고양이가 햄스터를 사냥합니다...");
    	
    }

    public void 그루밍하기(){
    	System.out.println("고양이가 그루밍을 합니다 할짝 할짝");
    }

    public void 놀기(){
    	System.out.println("고양이가 숲속 구석에서 놉니다~");
    	그루밍하기();
    	사냥하기();
    }
    
    public void 재주부리기(){
    	System.out.println("냐오옹 필살 꼬리 돌리기!!");
    	this.power += 1;
    	System.out.println("고양이의 근력이 1 증가했습니다 현재 : " + this.power);
    }

}
