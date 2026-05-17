//双重校验锁单例
//声明volatile→私有构造→方法→外层if→锁→内层if→new→返回
public class Singleton{
	private static volatile Singleton instance;

	private Singleton() {}

	public static Singleton getInstance(){
		if (instance == null) {
			synchronized (Singleton.class){
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
/*
问：为什么要 volatile？
答：解决指令重排导致的“逸出”。

问：为什么两次判空？
答：外层为了性能，内层为了保证唯一。

问：锁加在哪里？
答：加在类对象上，synchronized (Singleton.class)。
 */