package day03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

//字节字符包装流比较
public class CompareDemo {
	File srcFile = new File("file/ch.txt");
	File destFile = new File("file/stream.txt");

	@Test
	public void test1() throws Exception {
		InputStream in = new FileInputStream(
				srcFile);
		OutputStream out = new FileOutputStream(
				destFile);
		int len=-1;
		while ((len=in.read())!=-1){
			out.write(len);
		}
		System.out.println(out);
		out.close();
		in.close();
	}
	@Test
	public void test2() throws Exception {
		InputStream in = new FileInputStream(
				srcFile);
		OutputStream out = new FileOutputStream(
				destFile);
		byte[] buffer=new byte[1024];
		int len=-1;
		while ((len=in.read(buffer))!=-1){
			out.write(buffer,0,len);
		}
		System.out.println(out);
		out.close();
		in.close();
	}
	@Test
	public void test3() throws Exception {
		InputStream in = new BufferedInputStream(new FileInputStream(srcFile));				
		OutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));		
		byte[] buffer=new byte[1024];
		int len=-1;
		while ((len=in.read(buffer))!=-1){
			out.write(buffer,0,len);
		}
		System.out.println(out);
		out.close();
		in.close();
		
	}
}
