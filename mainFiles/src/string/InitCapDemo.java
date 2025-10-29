package string;

public class InitCapDemo {

	public static void main(String[] args) {

		String str = "my name Is Khan and i am not joker";

		char x = 'a';// 97 --> 65 {32}

//		System.out.println(x);//
//		System.out.println((char)(x-32));
//

		String strArr[] = str.split(" ");// 0:my 1:name 2:Is 3:Khan ...... >
		String newStr = "";
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);

			if (strArr[i].charAt(0) >= 'a' && strArr[i].charAt(0) <= 'z') {
				x = (char) (strArr[i].charAt(0) - 32);
				// khan
				System.out.println(x + strArr[i].substring(1));
				newStr = newStr + " " + x + strArr[i].substring(1);
			}else {
				newStr = newStr+" " + strArr[i];
			}

		}
		System.out.println("final string = > "+newStr);

	}

}
