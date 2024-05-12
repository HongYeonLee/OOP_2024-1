package 장소;
import java.util.ArrayList;


import Animal.동물;
import Main.Main;

public abstract class Place {	
	
	String where;
	protected  동물 []  animals = null;  //최대 10마리로 세팅!
	public int numOfAnimals = 0;
	int size = 10;  //크기 private도 아닌데 굳이 getSize()를 호출해야 하나..
	
	public int getSize() {
		return this.size;
	}
	
	//animals = new 동물[size]; 해주는 메소드 -> 숲속, 펫샵, 동물농장에서 사용
	public void setAnimals(String placeName)
	{	
		this.where = placeName;
		animals = new 동물[size];
	}
	
	public 동물[] getAnimals() {
		if (this.animals ==null) {
			System.out.println("아직 만들어지지 않았습니다."); 
			return null;
		}
		return this.animals;
	}	
	
	public 동물 getAnimal() {
		
		if (this.animals == null) {
			System.out.println("아직 만들어지지 않았습니다."); 
			return null;
		}
		
		int r = (int)(Math.random()*1000)%numOfAnimals;
    	return this.animals[r];
		
	}
	
	public 동물 getDog() {
		
		if (this.animals == null)
		{
			System.out.println("아직 동물이 없습니다");
			return null;
		}	
		else
		{
			for (int i = 0; i < animals.length; i++)
			{
				if (this.animals[i] != null)
					if (this.animals[i].getClass().getSimpleName().equals("강아지"))
						return this.animals[i];
			}
		}

		System.out.println("강아지가 없습니다");
		return null;
	}
	
	public 동물 getCat() {
		
		if (this.animals == null)
		{
			System.out.println("아직 동물이 없습니다");
			return null;
		}	
		else
		{
			for (int i = 0; i < animals.length; i++)
			{
				if (this.animals[i] != null)
					if (this.animals[i].getClass().getSimpleName().equals("고양이"))
						return this.animals[i];
			}
		}
		System.out.println("고양이가 없습니다");
		return null;
	}
	
	public 동물 getRabbit() {
		
		if (this.animals == null)
		{
			System.out.println("아직 동물이 없습니다");
			return null;
		}	
		else
		{
			for (int i = 0; i < animals.length; i++)
			{
				if (this.animals[i] != null)
					if (this.animals[i].getClass().getSimpleName().equals("토끼"))
						return this.animals[i];
			}
		}
		System.out.println("토끼가 없습니다");
		return null;
	}
	
	public 동물 getHamster() {
		
		if (this.animals == null)
		{
			System.out.println("아직 동물이 없습니다");
			return null;
		}	
		else
		{
			for (int i = 0; i < animals.length; i++)
			{
				if (this.animals[i] != null)
					if (this.animals[i].getClass().getSimpleName().equals("햄스터"))
						return this.animals[i];
			}
		}
		System.out.println("햄스터가 없습니다");
		return null;
	}
	
	public void showAnimals() {
		
		System.out.print("(총 " + numOfAnimals + "마리)");
		
		for(int i = 0; i < this.animals.length; i++) //처음에 null인데 왜 10으로 나오지 -> 숲속.getInstance() -> new 숲속() -> animals = new 동물[10] => place 클래스의 setAnimals 메소드를 추가해 수정
		{
			if(animals[i] != null) 	System.out.print(animals[i].이름 + " ");
			else System.out.print(" x  ");
		}
		
		System.out.println();
		System.out.println("------------------------------------------------");
	
	}
	
	public static void showAnimals(동물[] animals, int count) {
		
		System.out.print("(총 " + count +"마리)");
		
		for(int i=0; i < animals.length; i++) {
			if(animals[i] != null) 	System.out.print(animals[i].이름 + " ");
			else System.out.print(" x  ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------");
	
	}
	
	public  void set동물(동물 ani, int r) {
		animals[r] = ani;
		
	}
	
	public void addAnimal(동물 ani) {
		
		try
		{
			animals[numOfAnimals] = ani;
			numOfAnimals++;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("동물이 가득 차있습니다!");
		}	
		
	}	
	
	public void removeAnimal(동물 ani) {
		int i = 0;
		
		for(i = 0; i < numOfAnimals; i++) {
			if(animals[i] == ani) {
				animals[i] =null;
				break;
			}
		}
		
		animals[i] = animals[numOfAnimals - 1]; //기존에 빈 자리는 배열의 맨 뒤에 있던 동물이 채운다
		animals[numOfAnimals-1] = null; //맨 뒤는 비워둔다
		numOfAnimals--;
	}
	
	public void removeAll()
	{
		for (int i = 0; i < numOfAnimals; i++)
			animals[i] = null;
		numOfAnimals = 0;
	}

}
