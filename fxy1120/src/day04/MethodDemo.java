package day04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

public class MethodDemo {
	@Test
	public void test1() throws Exception {
		Class<User> clz = User.class;
		//clz.newInstance();
		Constructor<User> con = clz.getDeclaredConstructor(String.class,int.class);
		con.setAccessible(true);
		User cl = con.newInstance("小明", 24);

		Method m = clz.getMethod("doWork1");
		System.out.println(m);
		m=clz.getDeclaredMethod("sayHello",String.class,int.class);
		System.out.println(m);
	}
	@Test
	public void test2() throws Exception {
		Class<User> clz = User.class;
		Method m=clz.getMethod("doWork1");
		System.out.println(m);
		m=clz.getDeclaredMethod("sayHello",String.class,int.class);
		m.setAccessible(true);
		Object ret=m.invoke(clz.newInstance(),"will",19);
		System.out.println(ret);
		
		
		
	}

}
