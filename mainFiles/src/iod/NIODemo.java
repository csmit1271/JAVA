package iod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIODemo {

	public static void main(String[] args) {

		try {
			File file = new File("data4.txt");
			if (file.exists() == true) {
				//
			} else {
				boolean status = file.createNewFile();//
				System.out.println(status);
			}

		} catch (Exception e) {
			System.out.println("-------------");
		}

		Path path = Paths.get("data5.txt");
		try {

			boolean status = Files.exists(path);
			
			
			if (status == false) {
				Files.createFile(path);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done");

	}
}
