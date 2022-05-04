package miscellaneous;

//Generic class with 2 parameters - Maps- Stores data in form of key & value pairs - Hashmap, TreeMap

public class Pair<T,U> {

	private T first;
	private U second;
	
	
	
	public Pair() {
		this.first=null;
		this.second=null;
	}


	//generic constructor
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	

	public T getFirst() {
		return first;
	}



	public void setFirst(T first) {
		this.first = first;
	}



	public U getSecond() {
		return second;
	}



	public void setSecond(U second) {
		this.second = second;
	}


}
