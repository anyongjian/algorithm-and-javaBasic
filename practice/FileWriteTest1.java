package practice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//true��ʾ��д�ļ�,���������е��ļ������������ļ���ĩβ���������ݵ���д
		FileWriter fileWriter = new FileWriter("demo.txt",true);
		//\r\n��windows�еĻ��з�
		fileWriter.write("11111111\r\n222222");
		fileWriter.close();

	}

}
