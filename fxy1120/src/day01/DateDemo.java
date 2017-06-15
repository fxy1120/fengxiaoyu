package day01;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateDemo {

	@Test
	public void test1() throws Exception {
		Date d=new Date();
		System.out.println(d);
		DateFormat df=DateFormat.getDateInstance();
		String time=df.format(d);
		System.out.println(time);
		df=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		System.out.println(df.format(d));
		String tm="2017-1-21";
		df=DateFormat.getDateInstance();
		Date d2=df.parse(tm);
		System.out.println(d2);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void test2() throws Exception {
		Date current=new Date();
		Calendar c=Calendar.getInstance();
		c.setTime(current);
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY,0);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);
		Date endTime=c.getTime();
		c.add(Calendar.DAY_OF_MONTH,-7);
		Date beginTime=c.getTime();
		System.out.println(beginTime.toLocaleString());
		System.out.println(endTime.toLocaleString());
	}
}
