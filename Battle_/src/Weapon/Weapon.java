package Weapon;

import Player.Player;
import myInterface.Attackable;

public class Weapon implements Attackable {
	public String name;
    private int power;
    private double 무기공격확률;
    private double 추가능력확률;
    public boolean isSuccess = false;
    
    public Weapon() {
    }
    
    public Weapon(String name, int power, double 무기공격확률, double 추가능력확률)
    {
    	this.name = name;
    	this.power = power;
    	this.무기공격확률 = 무기공격확률;
    	this.추가능력확률 = 추가능력확률;
    }
    
    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
    	this.power = power;
    }
    
    public double get무기공격확률()
    {
    	return this.무기공격확률;
    }
    
    public void set무기공격확률(double 확률)
    {
    	this.무기공격확률 = 확률;
    }

    public void set추가능력확률(double 확률){
    	this.추가능력확률 = 확률;
    }

    public double get추가능력확률(){
        return this.추가능력확률;
    }

    public String attack(Player target, Player attacker){
    	String result = attacker.attack(target);
    	
    	if (attacker.getStress() < 10)
    	{
        	if (Math.random() < this.get무기공격확률())
        	{
            	result += this.getClass().getSimpleName() + "을(를) 이용합니다! 추가 power +" + this.power + "\n";
            	target.setHp(target.getHp() - this.power);
            	isSuccess = true;
        	}
        	else
        	{
        		result += this.getClass().getSimpleName() + "을(를) 이용한 공격은 실패했습니다...\n";
        		isSuccess = false;
        	}
    	}
    	else
    		isSuccess = false;

    	return result;
    }

	@Override
	public String attack(Player target) {
		// TODO Auto-generated method stub
		return null;
	}

}
