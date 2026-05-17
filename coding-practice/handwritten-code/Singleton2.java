//静态内部类单例
//私有构造，静态内部类持有常量，公有方法返回。

public class Singleton2 {
	private Singleton2() {}

	private static class Holder{
		private static final Singleton2 INSTANCE = new Singleton2();
	}

	public static Singleton2 getInstance() {
		return Holder.INSTANCE;
	}
}