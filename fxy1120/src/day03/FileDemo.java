package day03;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileDemo {
	public static void main(String[] args) {
		String file = "E:/基础班/笔记复习/day08笔记.xls";
		File f = new File(file);
		List<String> parentNames = new ArrayList<String>();
		listAllParent(parentNames, f);
		System.out.println(parentNames);
		StringBuilder sb = new StringBuilder(40);
		for (String name : parentNames) {
			sb.append(name).append(">");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}

	private static void listAllParent(
			List<String> parentNames, File f) {
		if(!"".equals(f.getParentFile().getName())){
			parentNames.add(f.getParentFile().getName());
		}if(f.getParentFile().getParentFile()!=null){
			listAllParent(parentNames, f.getParentFile());
		}

	}

}
