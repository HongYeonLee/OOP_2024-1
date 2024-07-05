package Weapon;
import java.util.ArrayList;

import Player.Player;

public class 머리카락 extends Weapon {

    public 머리카락(){
    }

    public 머리카락(int power){
    }

    public void 공격하기(Player target){
    }
    
    public void 머리카락뽑기(ArrayList<Player> targets) {
    	System.out.println("본헤드가 머리카락을 뽑아 적팀에게 충격을 주었습니다!");
    	System.out.println("팀 블러가 스트레스를 호소합니다...");
    	for (Player p : targets)
    	{
    		System.out.println(p.name + "의 스트레스가 3 증가하였습니다");
    		p.setStress(p.getStress() + 3);
    	}
    }

}
