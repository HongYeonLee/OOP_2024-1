package Weapon;
import java.util.ArrayList;

import Player.Player;
import View.Main;

public class 안경 extends Weapon {

    public 안경(){
    }

    public 안경(String name, int power, double 무기공격확률, double 추가능력확률){
    	super(name, power, 무기공격확률, 추가능력확률);
    }
    
    public String attack(Player target, Player attacker){
    	String result = super.attack(target, attacker);
    	
    	if (isSuccess)
    	{
        	if(Math.random() < this.get추가능력확률())
        		result += this.안경던지기(Main.blur);
        	else
        		result += "콕슨의 안경 던지기는 큰 감흥이 없었습니다...\n";
    	}
    	
    	return result;
    		
    }
    
    public String 안경던지기(ArrayList<Player> targets) {
    	
    	String txt = "콕슨이 안경을 벗은 모습을 보고 blur의 사기가 올라갔습니다!\n" + "blur의 hp가 5씩 증가합니다\n";

    	txt += "\n";
    	for (Player p : targets)
    	{
    		txt += p.name + "의 hp가 5 증가하였습니다\n";
    		p.setHp(p.getHp() + 5);
    	}
    	
    	txt += "\n";
    	
    	return txt;
    }

}
