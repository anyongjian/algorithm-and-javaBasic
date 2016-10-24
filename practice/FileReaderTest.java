package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		try {
			//创建一个文件读取流对象，和指定名称的文件相关联
			 fileReader = new FileReader("demo.txt");
			 //read（）一次读一个字符，会自动顺序往下读取
			 while(true){
				 int ch = fileReader.read();
				 if(ch==-1){
					 break;
				 }
				 System.out.print((char)ch);
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
