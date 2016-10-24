package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*装饰设计模式
 * 当想要对已有的功能进行功能增强时，可以定义一个类，
 * 将已有对象传入，基于已有的功能，并提供加强功能。那么自定义类称为装饰类
 * 
 * 装饰类通常会通过构造方法接受被装饰的对象。、
 * 并基于被装饰的对象的功能提供更强的功能。 
 * FileReader类没有readLine()方法，只有一次读一个字符的read方法，
 * MyBufferReaderTest将FileReader作为一个属性，并提供了readLine()方法，属于装饰模式
   MyBufferReaderTest实际上就是自己模拟的BufferedReaderlei类.
 * */
public class MyBufferReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader("demo1.txt");
		MyBufferReader myBufferReader = new MyBufferReader(fileReader);
		String line = null;
		while((line=myBufferReader.readLine())!=null){
			System.out.println(line);
		}
		myBufferReader.close();

	}

}
class MyBufferReader{
	private FileReader fileReader;
	public MyBufferReader(FileReader fileReader) {
		// TODO Auto-generated constructor stub
		this.fileReader = fileReader;
	}
	public String readLine() throws IOException{
		StringBuilder stringBuilder = new StringBuilder();
		int ch = 0;
			while((ch=fileReader.read())!=-1){
				if(ch=='\r'){
					continue;
				}
				if(ch=='\n'){
					return stringBuilder.toString();
				}else{
					stringBuilder.append((char)(ch));
				}
			}
			return null;
	}
	
	public void close() throws IOException{
			fileReader.close();
	}
}
