package Week12.player;
import java.util.ArrayList;

public abstract class Player {
    public String name;
    private int hp;
    private int power;
    
    public Player(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
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
		System.out.printf("%s ---> %s \n", this.name, target.name);
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
}
