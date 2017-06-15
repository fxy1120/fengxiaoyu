package day01;

import org.junit.Test;

public class StringDemo {
	public static void main(String[] args) {
		//定义一个char数组
		String str = "你好吗";
		char[] ch = str.toCharArray();
		System.out.println(ch[0]);
		System.out.println(ch.length);
		System.out.println(ch);
		System.out.println(str.getBytes());
		str = new String(str.getBytes());
		System.out.println(str);
		str = new String(ch);
		System.out.println(new String(ch));
		str = "adfa";
		str = str.toUpperCase();
		System.out.println(str);
	}

	//练习获取hello开头的文件扩展名
	@Test
	public void test1() throws Exception {
		String file = "abc.java;will.txt;hello.java;hello.class";
		String[] names = file.split(";");
		for (String name : names) {
			if (name.startsWith("hello")) {
				System.out.println(name);
				int index = name.lastIndexOf(".");
				System.out.println(index);
				//截取字符串
				String newName = name.substring(index+1);
				System.out.println(newName);

			}
		}
	}
	@Test
	public void test2() throws Exception {
		String str="abc";
		String letter=str.substring(0,1).toUpperCase();
		String word=str.substring(1);
		System.out.println(letter+word);
	}
	@Test
	public void test3() throws Exception {
		System.out.println(" AB CD ".length());
		System.out.println(" AB CD ".trim().length());
		//String str1=" ";
		//String str2="";
		//String str3=null;
		String str="ag";
		if(str!=null&&!("".equals(str.trim()))){
			System.out.println("非空");
		}else{
			System.out.println("空");
		}
		
	}
}
