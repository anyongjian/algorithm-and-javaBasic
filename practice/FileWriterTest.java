package practice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����һ��FileWriter���󣬸ö����ʼ����ʱ�����Ҫ��ȷ���������ļ���
		//���Ҹ��ļ��ᱻ������ָ��Ŀ¼��
		//�ò����Ŀ������ȷ�����ļ���λ��
		FileWriter fileWriter  = new FileWriter("demo.txt");
		//����write������������д�����У�
		fileWriter.write("abcdr");
		//ˢ���������еĻ�������
		fileWriter.flush();
		fileWriter.write("ffffff");
		//�ر�����Դ���ڹر�ǰ��ˢ��һ�λ��塣����close()���������ٱ�ʹ�ã�flush��ͬ������flush()�������رգ����Լ�������д������
		fileWriter.close();
		
		
	}

}
