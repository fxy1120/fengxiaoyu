package day04;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class ConstructorDemo {
	@Test
	public void test1() throws Exception {
		Class<User> clz = User.class;
		/*Constructor<User> con=clz.getConstructor();
		System.out.println(con);
		con=clz.getConstructor(String.class);
		//System.out.println(con);
		con=clz.getDeclaredConstructor(String.class);
		System.out.println(con);
		con=clz.getDeclaredConstructor(String.class,int.class);
		System.out.println(con);*/
		Constructor<?>[] cs = clz
				.getConstructors();
		System.out.println(cs.length);
		for (Constructor<?> constructor : cs) {
			System.out.println(constructor);
		}
		cs=clz.getDeclaredConstructors();
		for (Constructor<?> constructor : cs) {
			System.out.println(constructor);
		}

	}
}
