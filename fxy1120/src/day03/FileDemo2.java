package day03;

import java.io.File;
//批量修改文件名
public class FileDemo2 {
	public static void main(String[] args) {
		File dir=new File("C:/123");
		File[] fs=dir.listFiles();
		String deleteText="小码哥";
		String str="abc".replace("bc", "c");
		System.out.println(str);
		for(File file:fs){
			if(file.getName().contains(deleteText)){//如果包含要删除名称执行以下操作
				String newFileName=file.getName().replace(deleteText,"");//获取文件新名称
				file.renameTo(new File(dir,newFileName));//通过新名称给文件更新
				
			}
		}
	}

}
