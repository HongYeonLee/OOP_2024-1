package Week12.player;
import java.util.ArrayList;

public abstract class Player {
    public String name;
    private int hp;
    private int power;
    private String imgFile; // 이미지화일이름을 저장할 문자열
    
    public Player(String name, int hp, int power, String imgFile) {
		this.name = name;
		this.hp = hp;
		this.power = power;
		this.imgFile = imgFile;
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

	public void attack(Player target)
	{
		//무기없음. target의 hp를 power만큼 감소시킴
		System.out.printf("%s가 %s을 공격합니다. \n", this.name, target.name);
		target.hp -= this.power;
	}
		
    //public abstract void attack(Player target); //attack은 player마다 다를 예정이니 player클래스에서 구현할 필요x -> abstract

    public void attack(ArrayList<Player> targets){
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

	public String getImgFile() {
		return imgFile;
	}

	public void setImgFile(String imgFile) {
		this.imgFile = imgFile;
	}
    
    
}
