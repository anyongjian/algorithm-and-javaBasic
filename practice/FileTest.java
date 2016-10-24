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
			System.out.println("该分区大小："+file1.getTotalSpace()/(1024*1024*1024)+"G");
			System.out.println("文件名："+file1.getName());
			System.out.println("文件父目录字符串："+file1.getParent());
			System.out.println("绝对路径名:"+file1.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
