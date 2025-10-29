package string;

public class Hilltop {
	public static void main(String[] args) {
		
		
		char x =1; 
		x = 0x1;
		x = '\u004e';//\0
		String[] horses = new String[5];
		horses[4] = null;
		for (int i = 0; i < horses.length; i++) {
			if (i < args.length)
				horses[i] = args[i];
//			System.out.print(horses[i].toLowerCase() + " ");
		
		}
	
		System.out.println(x);
		System.out.println((char)78);
	}
}