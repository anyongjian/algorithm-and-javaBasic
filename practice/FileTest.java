package practice;

import java.io.File;
import java.io.IOException;

import javax.swing.DefaultBoundedRangeModel;

public class FileTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		File file = new File("abc"+File.separator+"a");
		file.mkdirs();	
		try {
			File file1 = new File("abc"+File.separator+"a"+File.separator+"demo.txt");
			file1.createNewFile();
			System.out.println("�÷�����С��"+file1.getTotalSpace()/(1024*1024*1024)+"G");
			System.out.println("�ļ�����"+file1.getName());
			System.out.println("�ļ���Ŀ¼�ַ�����"+file1.getParent());
			System.out.println("����·����:"+file1.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
