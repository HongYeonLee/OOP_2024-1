package Weapon;

import Player.Player;

public class 치즈 extends Weapon {

    public 치즈(){
    }

    public 치즈(String name, int power, double 무기공격확률, double 추가능력확률){
    	super(name, power, 무기공격확률, 추가능력확률);
    }
    
    public String attack(Player target, Player attacker){
    	String result = super.attack(target, attacker);

    	if (isSuccess)
    	{
        	if(Math.random() < this.get추가능력확률())
        		result += this.치즈만들기(target);
        	else
        		result += "알렉스의 치즈가 이상하게 만들어졌습니다...\n";
    	}
    	
    	return result;
    		
    }
    
    public String 치즈만들기(Player target) {
    	
    	String txt = "알렉스의 치즈가 "+ target.name +"(을)를 감동시켰습니다!\n" + target.name + "의 power가 3 감소합니다\n";    	
    	
    	target.setPower(target.getPower() - 3);
    	
    	return txt;
    }

}
