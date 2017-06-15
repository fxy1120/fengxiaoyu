package day03;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo1 {
	public static void main(String[] args) {
		File dir=new File("E:/大神班/day02");
		File[] fs=dir.listFiles(new FilenameFilter(){
			public boolean accept(File dir,String name){
				return new File(dir,name).isFile() && name.endsWith(".avi");
			}
		});
int u=0;
		for(File file:fs){
			System.out.println(file);
		}
	}
	
}
