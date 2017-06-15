package day01;

//������������ʽ
class ArrayUtil {
	// ����һ��˽�л���̬��Ա����Ķ���
	private static final ArrayUtil INSTANCE = new ArrayUtil();

	// ˽�л�������
	private ArrayUtil() {
	};
	// �ṩʵ���ķ���
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
