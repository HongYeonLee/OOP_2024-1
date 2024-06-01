package Weapon;

import Player.Player;
import myInterface.Attackable;

public class Weapon implements Attackable {
    public String 이름;
    private int power;
    private int 추가능력발동확률;

    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
    	this.power = power;
    }

    public void set추가능력발동확률(int 확률){
    }

    public int get추가능력발동확률(){
        return 0;
    }

    public void attack(Player target){
    }

}
