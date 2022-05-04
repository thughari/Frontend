package miscellaneous;

public class Container<T> {

	private T t;
	
	public void add(T t) {
        this.t = t;
     }



     public T get() {
        return t;
     }
     
	public static void main(String[] args) {
		Container<String> strContainer = new Container<String>();
		Container<Integer> intContainer = new Container<Integer>();
		
		strContainer.add("hello");

		intContainer.add(100);
		
		System.out.println(strContainer.get());
		System.out.println(intContainer.get());

	}

}
