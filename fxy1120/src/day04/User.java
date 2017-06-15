package day04;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
	private int age;
	private String name;
	public User() {
		System.out.println("无参数");
	}
	@SuppressWarnings("unused")
	private User(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("两个参数");
	}
	public User(String name){
		System.out.println("一个参数");
		}
	public void doWork1(){
	 System.out.println("公共无参数无返回方法");
	}
	public static void doWork(String name){
		System.out.println("公共静态无返回有参数方法");
	}
	private String sayHello(String name,int age){
		System.out.println("私有有返回有参数方法");
		return name+","+age;
		
	}

}
