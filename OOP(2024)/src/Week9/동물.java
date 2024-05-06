package Week9;

public class 동물 implements 사냥{
	public String name;
	int hp;
	int power;
	
	public 동물(){}
	
	public 동물(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
		
		System.out.println(this.name + "의 hp는 " + this.hp + "이고 power는 " + this.power + "입니다");
	}
	
	public void 사냥 (동물 target)
	{	
		if (this instanceof 기린 || this instanceof 토끼)
			System.out.println(this.name + "은(는) 사냥할 수 없습니다");
		
		else if (this instanceof 사자 && target instanceof 상어)
			System.out.println(this.name + "는 " + target.name + "를 사냥할 수 없습니다");
		
		else
		{
			System.out.println(this.name + "이(가) " + target.name + "을(를) 사냥합니다");
			this.hp += target.power;
			target.hp -= this.power;
			
			System.out.println(this.name + "의 hp가 " + this.hp + "로 변했으며 " + target.name + "의 hp는 " + target.hp + "로 변했습니다");
			
			if(target.hp <= 0)
				System.out.println(target.name + "이(가) 죽었습니다");

		}
		
	}
}
