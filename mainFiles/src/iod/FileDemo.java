package iod;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// input out -> IOException
		File file = new File("data.txt");// file->data.txt link logical
		file.createNewFile();// boolean {true , false }

		System.out.println(file.length());// byte ->long

		File file2 = new File("c:\\Setup.log");
		System.out.println(file2.exists());// true | false

		File file3 = new File("c:\\temp\\a.txt");
		file3.delete(); // boolean -> true | false

		// folder

		File m = new File("c://tmp");
		m.mkdir();

		File data = new File(m, "data.txt");
		data.createNewFile();

		// rename
		File data2 = new File(m, "data2.txt");
		data.renameTo(data2);

		// list of all the files/folders from source->
		File f = new File("c:\\");

		String cList[] = f.list();
		
		File allFiles[]  =  f.listFiles(); 
		
		int fileCounter = 0;
		int dirCounter = 0;
		System.out.println("content of the c drive :");
		for (String x : cList) {
			System.out.println(x);
			File fx = new File(f, x);// python
			if (fx.isFile()) {
				fileCounter++;
			} else if (fx.isDirectory()) {
				dirCounter++;
			}
		}
		System.out.println("Total Files : "+fileCounter);
		System.out.println("Total Dir   : "+dirCounter);

		File python = new File("c:\\tejas.shah");
		System.out.println(python.isFile());
		System.out.println(python.isDirectory());

		System.out.println("done");

	}
}
