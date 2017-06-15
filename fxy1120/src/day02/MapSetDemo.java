package day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapSetDemo {
public static void main(String[] args) {
	Set<String> name1=new HashSet<>();
	name1.add("赵一");
	name1.add("王二");
	name1.add("张三");
	Set<String> name2=new HashSet<>();
	name2.add("春花");
	name2.add("秋月");
	name2.add("夏爽");
	Map<String, Object> class1=new HashMap<>();
	class1.put("学期班", name1);
	Map<String, Object> class2=new HashMap<>();
	class2.put("大神班", name2);
	List<Map<String,Object>> list=new ArrayList<>();
	list.add(class1);
	list.add(class2);
	System.out.println(list);
	
}
}
