package Week12.player;
import java.util.ArrayList;

public class Player {
    public String name;
    private int hp;
    private int power;
    private String imgFile1; // 이미지화일이름을 저장할 문자열
    private String imgFile2;
    
    public Player(){
    }
    
    public Player(String name, int hp, int power, String imgFile1, String imgFile2) {
		this.name = name;
		this.hp = hp;
		this.power = power;
		this.imgFile1 = imgFile1;
		this.imgFile2 = imgFile2;
	}
    
	public void attack(Player target)
	{
		//무기없음. target의 hp를 power만큼 감소시킴
		System.out.printf("%s가 %s을 공격합니다. \n", this.name, target.name);
		target.hp -= this.power;
	}
	
    public void show(){
    	
    	System.out.printf("%2s(%3d)(%2d) : ", this.name, this.hp, this.power);
    	
    	int a = hp/10;
    	int b = hp%10;
    	
    	for (int i = 0; i < a; i++)
    		System.out.print("❤ ");
    		
    	for (int i = 0; i < b; i++)
    		System.out.print("💕 ");
    	
    	
    	
    	System.out.println();
    }
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

    public String getImgFile1() {
		return imgFile1;
	}

	public String getImgFile2() {
		return imgFile2;
	}

	public void setImgFile1(String imgFile1) {
		this.imgFile1 = imgFile1;
	}

	public void setImgFile2(String imgFile2) {
		this.imgFile2 = imgFile2;
	}

    //public abstract void attack(Player target); //attack은 player마다 다를 예정이니 player클래스에서 구현할 필요x -> abstract
	
	public void attack(ArrayList<Player> targets){
    }

    
    
    
}
