package generic;


class TwoGeneric<T,Q>{
	void add(T a,T b) {

	}
	void sub(T a,Q b) {
		
	}
}
public class GenericAddition<T> {

	void add(T a,T b) {
		
	}
//collection -> generic 

	public static void main(String[] args) {
		GenericAddition<Integer> g = new GenericAddition<Integer>(); 
		g.add(20, 30);
		
		GenericAddition<Float> f = new GenericAddition<>(); 
		f.add(20.20f, 20.20F);
		
		TwoGeneric<String,Integer> t = new TwoGeneric<>();
		t.add("", "");
		t.sub("", 0);
		
		
	}
}
