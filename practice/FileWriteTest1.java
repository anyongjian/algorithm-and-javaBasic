package practice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//true表示续写文件,不覆盖已有的文件，并在已有文件的末尾处进行数据的续写
		FileWriter fileWriter = new FileWriter("demo.txt",true);
		//\r\n是windows中的换行符
		fileWriter.write("11111111\r\n222222");
		fileWriter.close();

	}

}
