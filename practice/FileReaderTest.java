package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		try {
			//����һ���ļ���ȡ�����󣬺�ָ�����Ƶ��ļ������
			 fileReader = new FileReader("demo.txt");
			 //read����һ�ζ�һ���ַ������Զ�˳�����¶�ȡ
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
