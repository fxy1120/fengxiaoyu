package day01;

//自定义逻辑异常

public class LogicException extends
		RuntimeException {
	private static final long serialVersionUID = 1L;

	public LogicException() {
		super();
	}

	public LogicException(String message) {
		super(message);
	}

	public static String[] names = { "will",
			"lucy", "lily" };

	public static void main(String[] args) {
		check("lucy");
	}

	public static void check(String usename) {
		try {
			for (String name : names) {
				if (usename.equals(name)) {
					throw new LogicException(
							"该用户已经被注册");
				}
			}
			System.out.println("注册成功");
		} catch (LogicException e) {
			System.out.println(e.getMessage());
		}
	}
}
