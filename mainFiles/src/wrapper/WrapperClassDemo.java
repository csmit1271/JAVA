package wrapper;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		 
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		
		System.out.println(i1 == i2);//false
		System.out.println(i1.equals(i2));//true
		
		
		//j5 
		//autoboxing 
		//box 
		//unbox 
		if(i1 == 10) {
			
		}
		if(i1.intValue() == 10 ) {
			
		}
		
		
		
		String str = "12";
		int a = Integer.parseInt(str);
		
		
		str = "12.22";
		double d = Double.parseDouble(str);

		str = "royal";
		
		int r = Integer.parseInt(str);//NumberFormatException 
		
		
	}
}
