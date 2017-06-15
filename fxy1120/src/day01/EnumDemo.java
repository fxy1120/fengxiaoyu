package day01;

//创建单例饿汉式
class ArrayUtil {
	// 创建一个私有化静态成员本类的对象
	private static final ArrayUtil INSTANCE = new ArrayUtil();

	// 私有化构造器
	private ArrayUtil() {
	};
	// 提供实例的返回
	public static ArrayUtil getInstance(){
		return INSTANCE;
	}
	public void sort(int[] arr){
		System.out.println(arr);
	}
}
enum ArrayUtilS{
	INSTANCE;
	public void sort(){
		System.out.println("meiju");
	}
}
public class EnumDemo {
	public static void main(String[] args) {
    ArrayUtil arr=ArrayUtil.getInstance();
    int[] b=new int[]{1,2,3};
    arr.sort(b);
    ArrayUtilS brr=ArrayUtilS.INSTANCE;
    ArrayUtilS.INSTANCE.sort();
    brr.sort();
	}
}
