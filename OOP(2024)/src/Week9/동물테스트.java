package Week9;

public class 동물테스트 {
	public static void main(String[] args)
	{
		기린 a = new 기린("김기린", 30, 5); //이름: 김기린, hp: 30, power: 3
		사자 b = new 사자("이사자", 40, 15); //이름: 이사자, hp: 40, power: 15
		상어 c = new 상어("박상어", 40, 15); //이름: 박상어, hp: 40, power: 15
		토끼 d = new 토끼("최토끼", 10, 1); //이름: 최토끼, hp: 10, power: 1
		
		System.out.println();
		
		
		//기린이 사냥
		a.사냥(b); //기린 -> 사자
		a.사냥(c); //기린 -> 상어
		a.사냥(d); //기린 -> 토끼
		System.out.println();
		
		//사자가 사냥
		b.사냥(a); //사자 -> 기린
		b.사냥(c); //사자 -> 상어
		b.사냥(d); //사자 -> 토끼
		System.out.println();
		
		//상어가 사냥
		c.사냥(a); //상어 -> 기린
		c.사냥(b); //상어 -> 사자
		c.사냥(d); //상어 -> 토끼
		System.out.println();
		
		//토끼가 사냥
		d.사냥(a); //토끼 -> 기린
		d.사냥(b); //토끼 -> 사자
		d.사냥(c); //토끼 -> 토끼
		System.out.println();
		
	}
}
