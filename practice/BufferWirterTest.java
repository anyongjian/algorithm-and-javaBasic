package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWirterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		try {
			//����һ��д��������
			fileWriter = new FileWriter("demo1.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("ssss");
			bufferedWriter.flush();
			//�رջ�������ʵ���ǹرջ������е�������
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
