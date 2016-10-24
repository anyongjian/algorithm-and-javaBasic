package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWirterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		try {
			//创建一个写入流对象
			fileWriter = new FileWriter("demo1.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("ssss");
			bufferedWriter.flush();
			//关闭缓冲区其实就是关闭缓冲区中的流对象
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
