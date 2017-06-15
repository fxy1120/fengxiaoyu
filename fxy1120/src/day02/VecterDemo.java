package day02;

import java.util.Vector;

public class VecterDemo {

	public static void main(String[] args) {
		Vector<Integer> ve=new Vector<>();
		ve.add(1);
		ve.add(2);
		ve.add(3);
		ve.add(4);
		ve.add(5);
		ve.remove(1);
		//ve.remove(2);
		System.out.println(ve);
		Vector<String> vec=new Vector<>();
		vec.add("a");
		vec.add("b");
		vec.add("c");
		vec.add("d");
		vec.add("e");
		vec.remove("a");
		ve.remove(2);
		System.out.println(vec);
	}

}
