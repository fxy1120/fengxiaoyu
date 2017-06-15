package day03;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderDemo {
	public static void main(String[] args) throws Exception {
		//创建源对象ff
		File srcFile = new File("file/ch.txt");
		File destFile=new File("file/stream.txt");
		Reader in = new FileReader(srcFile);
		Writer out=new FileWriter(destFile);
		char[] buffer=new char[5];
		int len=-1;
		while((len=in.read(buffer))!=-1){
			System.out.println(buffer);
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
	}

}
