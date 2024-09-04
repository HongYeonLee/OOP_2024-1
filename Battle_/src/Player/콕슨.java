package Player;
public class 콕슨 extends Player {

    public 콕슨(){
    }

    public 콕슨(String name, int hp, int power, String image_live, String image_dead, String attackName){
    	super(name, hp, power, image_live, image_dead, attackName);
    }

    public String attack(Player target)
    {
    	String result = "";
    	if (this.getStress() < 10)
    	{
    		result += super.attack(target);
        	result += this.name + "이 " + target.name + "에게 헛소리를 날립니다\n" + target.name + "에게 " + this.getPower() + " 공격이 들어갔습니다!\n";
    	}
    	return result;
    }
    
    public String 스트레스해소()
    {
    	String txt = "";
    	txt += super.스트레스해소() + "콕슨 : 끝내주는 기타 연주나 해야겠다\n" + this.name + "의 스트레스 : " + this.getStress();
    	
    	return txt;
    }
}
