package Player;

import java.util.ArrayList;

import Weapon.Weapon;
import Player.Player;
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
    private String attackName;
    
	public int originalHp;

    public Player(){
    }

    public Player(String name, int hp, int power, String image_live, String image_dead, String attackName){
    	this.name = name;
    	this.hp = hp;
    	this.power = power;
    	this.image_live = image_live;
    	this.image_dead = image_dead;
    	originalHp = hp;
    	this.attackName = attackName;
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

    public int getStress(){
    	return this.stress;
    }
    
    public void setStress(int stress){
    	this.stress = stress;
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
	
	public String getAttackName()
	{
		return this.attackName;
	}
	
	public void setAttackName(String attackName)
	{
		this.attackName = attackName;
	}
	
	public String 스트레스해소(){
		
		String txt = "";
		txt += this.name + "이(가) 스트레스를 풉니다...\n";
		if (this.stress - 5 > 0)
			this.stress -= 5;
		else
			this.stress = 0;
		
		return txt;
    	
    }
    
    public String attack(Player target){
    	
    	String result = "";
    	
    	if (this.stress < 10)
    	{
    		result += this.name + "이(가) " + target.name + "을(를) 공격합니다!\n";
    		target.hp -= this.power;
    		this.stress += 1;
    	}
    	else
    	{
    		result += this.name + "의 스트레스가 너무 높아 " + target.name + "을(를) 공격하기 싫어합니다...\n";
    	}
    	
    	return result;
    }
    
    public void attack(ArrayList<Player> targets) {
    	if (this.stress < 10) {
    		System.out.print(this.name + "이(가) ");
    		for (Player p : targets)
    		{
    			System.out.println(p.name + "을(를) 공격합니다!");
    			p.hp -= this.power;
    			this.stress += 1;
    		}
    	}
    	else
    	{
    		System.out.println(this.name + "의 스트레스가 너무 높아 공격하기 싫어합니다...");
    	}
    }

    public String show(){
    	String txt = String.format("%2s의 hp : %3d | power : %2d | stress : %2d\n", this.name, this.hp, this.power, this.stress);
    	return txt;
    	
    }

}
