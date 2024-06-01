package Player;
public class 노엘 extends Player {

    public 노엘(){
    }

    public 노엘(String name, int hp, int power, String image_live, String image_dead){
    	super(name, hp, power, image_live, image_dead);
    }

    public void attack(Player target){
    	super.attack(target);
    }

    public void 스트레스해소(){
    	super.스트레스해소();
    }

}
