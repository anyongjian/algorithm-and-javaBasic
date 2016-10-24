package practice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建一个FileWriter对象，该对象初始化的时候必须要明确被操作的文件。
		//而且该文件会被创建到指定目录下
		//该步骤的目的是明确创建文件的位置
		FileWriter fileWriter  = new FileWriter("demo.txt");
		//调用write（），将数据写到流中，
		fileWriter.write("abcdr");
		//刷新流对象中的缓冲数据
		fileWriter.flush();
		fileWriter.write("ffffff");
		//关闭流资源，在关闭前会刷新一次缓冲。调用close()后，流不能再被使用，flush则不同，调用flush()后，流不关闭，可以继续进行写操作。
		fileWriter.close();
		
		
	}

}
