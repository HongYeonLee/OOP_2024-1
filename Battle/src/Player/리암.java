package Player;
public class 리암 extends Player {

    public 리암(){
    }

    public 리암(String name, int hp, int power, String image_live, String image_dead){
    	super(name, hp, power, image_live, image_dead);
    }

    public void attack(Player target){
    	super.attack(target);
    }

    public void 스트레스해소(){
    	super.스트레스해소();
    }

}
