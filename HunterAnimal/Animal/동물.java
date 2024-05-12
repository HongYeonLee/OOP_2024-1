package Animal;
import Main.*;

public abstract class 동물 implements Playable, Moveable, Huntable, Workable, Escapeable {
    public String 이름;
    private int 나이;
    private int 납치확률;
    private int 구조확률;
    
    public int hp;
    public int power;
    private int money;

    public 동물(){
    	System.out.println(this.getClass().getSimpleName() + " 한 마리가 숲속에 태어났습니다! "); //this.getClass().getSimpleName() -> 어떤 클래스 타입의 객체로 만들어졌는지 
    }

	public 동물(String 이름){
    	//this(); //위의 기본생성자 호출
    	this.이름 = 이름;
    	System.out.println("이름이 " + this.이름 +"인 동물을 한마리 생성합니다.");
    }

    public int get나이(){
    	
        return this.나이;
    }

    public void set나이(int 나이){	
    	this.나이 = 나이;
    }   

    public int get납치확률(){
    	
        return this.납치확률;
    }

    public void set납치확률(int 납치확률){
    	this.납치확률 = 납치확률;
    }   
    
    public int get구조확률() {
		return this.구조확률;
	}

	public void set구조확률(int 구조확률) {
		this.구조확률 = 구조확률;
	}
	
    public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public abstract void 놀기();

    public void 먹기(){
    	System.out.println("동물들이 산에서 풀을 뜯어먹어요");
    }

    public void 자기(){
    }

    public void 움직이기(){
    }

    public void show(){
    	
    }

}
