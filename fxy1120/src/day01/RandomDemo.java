package day01;

import java.util.Random;
import java.util.UUID;

import org.junit.Test;

public class RandomDemo {
	@Test
	public void test1() throws Exception {
		Random r1=new Random();
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
	}
	@Test
	public void test2() throws Exception {
		String code=UUID.randomUUID().toString().substring(0,5);
		System.out.println(code);
		StringBuilder sb=new StringBuilder(5);
		for(int i=0;i<5;i++){
			char ch=code.charAt(new Random().nextInt(code.length()));
			sb.append(ch);
		}
		System.out.println(sb);
	}
	

}
