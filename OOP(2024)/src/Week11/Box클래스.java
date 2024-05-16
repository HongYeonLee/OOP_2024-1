package Week11;


class Box {
	private Object data;
	
	public void set(Object data)
	{
		this.data = data;
	}
	
	public Object get()
	{
		return this.data;
	}
}
public class Box클래스 {
	
	public static void main(String[] args)
	{
		Box s = new Box();
		s.set(1234);
		s.set("abcde");
		
		String p = (String)s.get();
		s.set(5678);
		Integer a = (Integer)s.get();
		p = (String)s.get();
	}
	

	
}
