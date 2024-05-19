package Week11;

public class Lab8_2 {
	static class MyStore<T>{
		public T data;
		
		public void set(T data) {
			this.data = data;
		}
		
		public T get() {
			return this.data;
		}
	}
	
	public static void main(String[] args)
	{
		MyStore<String>[] store1 = new MyStore[10];
		MyStore<Integer>[] store2 = new MyStore[10];
		
		store1[0] = new MyStore(); //첫번째 방만 만들어 테스트
		store1[0].set("aaa");
		//store1[1].set(1234);  store1은 타입 파라미터가 String이므로 정수를 받을 수 없음
		
		store2[0] = new MyStore();
		store2[0].set(123);
		//store2[0].set("abcd"); store2은 타입 파라미터가 Integer이므로 String을 받을 수 없음
		
		System.out.println(store1[0].get());
		System.out.println(store2[0].get());
	}
}
