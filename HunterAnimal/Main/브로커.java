package Main;
import Animal.강아지;
import Animal.고양이;
import Animal.동물;
import Animal.토끼;
import Animal.햄스터;
import 장소.*;

public class 브로커 {
	//동물[] 동물농장;
	동물농장 farm = 동물농장.getInstance();
	숲속 forest = 숲속.getInstance();
	펫샵 petShop= 펫샵.getInstance();

	private int 브로커money = 0; //기본 0만원
	private 동물 dog;
	public 브로커() {
		
		System.out.println("===================================");
		System.out.println(" 브로커가 나타났습니다! 동물들은 어떻게 될까요?");
		System.out.println("===================================");
	} 
	public 브로커(int size){
    	this();
    	동물농장 farm = 동물농장.getInstance(size);
    }
    
    public void showInfo() {
    	System.out.println("------------------------------------------------");
    	System.out.println("브로커의 동물농장 크기 : " + farm.getSize()); //place의 getSize() 메소드 호출
    	System.out.println("브로커의 돈 : " + this.브로커money +"만원");    	
    	System.out.println("동물농장에 있는 동물 수 : " + farm.numOfAnimals); //place의 numOfAnimals
    	System.out.println("------------------------------------------------");
    	
    	farm.showAnimals(); //place의 showAnimals() 메소드 호출
    }
 
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("# 브로커의 동물농장 :");	
		farm.showAnimals(); //place 클래스의 showAnimals() 메소드 호출
	}
	
    public boolean 납치하기(동물 ani){    	
    	System.out.println("무조건 성공! 뭐든지 잡고 본다! " + ani.이름);    	
    	return true;
    }
 
    public boolean 납치하기(강아지 dog){
    	System.out.println("브로커가 강아지를 납치하려고 합니다...");
    	boolean signal = doRandom(dog);
    	return signal;
    }
    
    public boolean 납치하기(고양이 cat){
    	System.out.println("브로커가 고양이를 납치하려고 합니다...");
    	boolean signal = doRandom(cat);
    	return signal;
    }
   
    public boolean 납치하기(토끼 rabbit){
    	System.out.println("브로커가 토끼를 납치하려고 합니다...");
    	boolean signal = doRandom(rabbit);
    	return signal;  
    }
    
    public boolean 납치하기(햄스터 ham){
    	System.out.println("브로커가 햄스터를 납치하려고 합니다...");
    	boolean signal = doRandom(ham);
    	return signal;  
    }
    
    //동물들의 납치확률에 따라 납치성공여부 결과 리턴
    public boolean doRandom(동물 animal) {
    	int r = (int)(Math.random()*1000)% 100;
    	if( r < animal.get납치확률()) {
    		System.out.println("브로커가 " + animal.이름 + " 납치하기를 성공했습니다!");
    		return true;
    	}
    	else System.out.println("브로커가 " + animal.이름 + " 납치하기를 실패했습니다...");
    	return false;
    }
    
    //장소별로 오버로딩 가능
    //랜덤으로 동물 납치하기 -> 동물을 선택해서 납치하기
    public void 납치하기()
    {
    	forest.show(); //숲속에 있는 동물 보여주기
    	System.out.print("어떤 동물을 납치하겠습니까? : ");
    	String name = Main.input.next(); //메인에서 인풋 변수 전역으로 선언하기
    	동물 target = null;
    	boolean sig = false;
    	
    	if (name.equals("강아지"))
    	{
    		target = forest.getDog();
    		if (target != null)
    			sig = 납치하기((강아지)target);
    	}
    	else if (name.equals("고양이"))
    	{
    		target = forest.getCat();
    		if (target != null)
    			sig = 납치하기((고양이)target);
    	}
    	else if (name.equals("토끼"))
    	{
    		target = forest.getRabbit();
    		if (target != null)
    			sig = 납치하기((토끼)target);
    	}
    	else if (name.equals("햄스터"))
    	{
    		target = forest.getHamster();
    		if (target != null)
    			sig = 납치하기((햄스터)target);
    	}
    	else
    		System.out.println("그런 동물은 없습니다.");

//    	//1. 동물배열중에서 랜덤하게 아무거나 고르기 : getAnimal()
//    
//    	동물 ani = forest.getAnimal(); //place 클래스의 getAnimal() 메소드 호출
//    	boolean sig = false;    
//    
//    	//2. 동물에 따라 사냥확률 계산하기
//    	if (ani instanceof 강아지) sig = 납치하기((강아지)ani); //다운캐스팅
//    	else if (ani instanceof 토끼) sig = 납치하기((토끼)ani);
//    	else if (ani instanceof 고양이) sig = 납치하기((고양이)ani);
//    	else sig = 납치하기(ani);  // 동물을 인자로 받는 사냥하기가 호출됨.
//
    	//3. 숲에서 removeAnimal(), 동물농장에 addAnimal() 
    	if(sig == true) {
    		forest.removeAnimal(target); //place 클래스의 removeAnimal(동물 ani) 메소드 호출
    		farm.addAnimal(target); //place 클래스의 addAnimal(동물 ani) 메소드 호출
    	}
    }
   
    public void 납치하기(동물 [] animals){
    	//...
    	
    }
    
    
    
    public void 동물팔기()
    {
    	farm.show(); //숲속에 있는 동물 보여주기
    	System.out.print("어떤 동물을 펫샵에 팔겠습니까? : ");
    	String name = Main.input.next(); //메인에서 인풋 변수 전역으로 선언하기
    	동물 target = null;
    	
    	if (name.equals("강아지"))
    	{
    		target = farm.getDog();
    		if (target != null)
    		{
    			System.out.println("강아지를 펫샵에 팝니다");
    			petShop.addAnimal(target);
    			farm.removeAnimal(target);
    			getMoney();
    		}
    	}
    	
    	else if (name.equals("고양이"))
    	{
    		target = farm.getCat();
    		if (target != null)
    		{
    			System.out.println("고양이를 펫샵에 팝니다");
    			petShop.addAnimal(target);
    			farm.removeAnimal(target);
    			getMoney();
    		}
    	}
    	
    	else if (name.equals("토끼"))
    	{
    		target = farm.getRabbit();
    		if (target != null)
    		{
    			System.out.println("토끼를 펫샵에 팝니다");
    			petShop.addAnimal(target);
    			farm.removeAnimal(target);
    			getMoney();
    		}
    	}
    	
    	else if (name.equals("햄스터"))
    	{
    		target = farm.getHamster();
    		if (target != null)
    		{
    			System.out.println("햄스터를 펫샵에 팝니다");
    			petShop.addAnimal(target);
    			farm.removeAnimal(target);
    			getMoney();
    		}
    	}
    	
    	else
    		System.out.println("그런 동물은 없습니다");
    }
    
    public void getMoney()
    {
		//1만원 ~ 3만원 사이의 돈 획득
    	int earn = (int)(Math.random()*100000)%30000 + 10000;
    	this.브로커money += earn;
    	System.out.println("펫샵에 팔아 " + earn + "원을 벌었습니다! (현재 브로커 돈: " + this.브로커money + "원)");
    	
    	if (this.브로커money >= 100000) //10만원 이상 모았을 경우
    		buyPetShop();
    }
    
    public void buyPetShop()
    {
    	System.out.println("브로커가 동물을 팔아 10만원 이상을 모았습니다!");
    	System.out.println("펫샵을 매매할 수 있게되었습니다!");
    	System.out.println("숲속의 동물들이 모두 펫샵으로 이동합니다...");
    	
    	for (int i = 0; i < forest.numOfAnimals; i++)
    		petShop.addAnimal(forest.getAnimals()[i]);
    	
    	
    	forest.removeAll();
    	forest.show();
    	petShop.show();
    	Main.flag = 1;
    }
}
