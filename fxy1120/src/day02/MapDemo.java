package day02;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<Character,Integer> map=new HashMap<>();
		String str="alkeomcgwjerongqowqeklgajoierwonig";
		char[] ch=str.toCharArray();
		for(char c:ch){
			if(map.containsKey(c)){
				Integer old=map.get(c);
				map.put(c, old+1);
			}else{
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
