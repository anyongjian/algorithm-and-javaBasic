package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fileWriter  = null;
		FileReader fileReader = null;
		BufferedWriter bufferedWriter = null;
		BufferedReader bufferedReader = null;
		try {
			fileWriter = new FileWriter("demo1_copy.txt");
			fileReader = new FileReader("demo1.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while((line = bufferedReader.readLine())!=null){
				bufferedWriter.write(line);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				bufferedReader.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
