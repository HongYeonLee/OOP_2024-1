package Player;

import Weapon.Weapon;
import myInterface.Attackable;
import myInterface.StressRelief;

public abstract class Player implements StressRelief, Attackable {
    public String name;
    private int hp;
    private int power;
    private Weapon weapon;
    private int stress;
    private String image_live;
    private String image_dead;

    public Player(){
    }

    public Player(String name, int hp, int power, String image_live, String image_dead){
    	this.name = name;
    	this.hp = hp;
    	this.power = power;
    	this.image_live = image_live;
    	this.image_dead = image_dead;
    	System.out.println(this.name + "이(가) 등장했습니다!");
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
    	this.hp = hp;
    }

    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
    	this.power = power;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Weapon weapon){
    	this.weapon = weapon;
    }


    public void setStress(int stress){
    	this.stress = stress;
    }

    public int getStress(){
    	return this.stress;
    }
    
    public String getImage_live() {
		return image_live;
	}

	public String getImage_dead() {
		return image_dead;
	}

	public void setImage_live(String image_live) {
		this.image_live = image_live;
	}

	public void setImage_dead(String image_dead) {
		this.image_dead = image_dead;
	}

	public void 스트레스해소(){
		System.out.println(this.name + "이(가) 스트레스를 풉니다...");
		if (this.stress - 5 > 0)
			this.stress -= 5;
		else
			this.stress = 0;
		System.out.println(this.name + "의 스트레스 : " + this.stress);
    	
    }
    
    public void attack(Player target){
    	
    	if (this.stress < 10)
    	{
    		System.out.println(this.name + "이(가) " + target.name + "을(를) 공격합니다!");
    		target.hp -= this.power;
    		this.stress += 1;
    	}
    	else
    	{
    		System.out.println(this.name + "의 스트레스가 너무 높아 " + target.name + "을(를) 공격하기 싫어합니다...");
    	}
    		
    }
    
    public void show_header(){
    }

    public void show(){
    	System.out.printf("%2s의 hp : %3d | power : %2d | stress : %2d\n", this.name, this.hp, this.power, this.stress);
    	
    }

}
