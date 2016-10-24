package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest2 {

	public static void main(String[] args) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("src//practice//applicationContext.xml");
			char[] buffer = new char[1024];
			int num = 0;
			while((num=fileReader.read(buffer))!=-1){
				System.out.print(new String(buffer,0,num));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
