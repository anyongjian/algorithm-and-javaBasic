package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class GetFileLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inputStream = null;
		int count = 0;
		try {
			inputStream = new FileInputStream(new File("demo1.txt"));
			while(inputStream.read() != -1){
				count++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("count:"+count);

	}

}
