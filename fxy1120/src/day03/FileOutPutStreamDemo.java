package day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutPutStreamDemo {
	public static void main(String[] args) {
		File srcFile = new File("file/stream.txt");
		File destFile = new File(
				"file/stream_copy.txt");
		try (InputStream in = new FileInputStream(
				srcFile);
				OutputStream out = new FileOutputStream(
						destFile);) {
			byte[] buffer = new byte[10];
			int len = -1;
			while ((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
