/**
 * 记住这个优先级顺序，这是解题的万能钥匙：
 * 1.	第一级（最高）：静态块 static {}
 *  	时机：类第一次被加载时。
 *  	次数：这辈子只执行一次。
 *  	顺序：先父类，后子类（爸爸不加载，儿子出不来）。
 * 2.	第二级（中间）：普通代码块 {}
 *  	时机：创建对象（new）时，在构造器之前。
 *  	次数：每次 new 都会执行。
 *  	顺序：先父类，后子类。
 * 3.	第三级（最后）：构造器 Constructor
 *  	时机：普通代码块执行完后。
 *  	次数：每次 new 都会执行。
 */
class X {
    public X() {
        System.out.println("X构造器");
    }

    {
        System.out.println("X普通代码块");
    } // 普通块

    static {
        System.out.println("X静态块");
    } // 静态块
}

class Y extends X {
    public Y() {
        System.out.println("Y构造器");
    }

    static {
        System.out.println("Y静态块");
    }

    {
        System.out.println("Y普通代码块");
    }
}

public class geminitest {
    public static void main(String[] args) {
        System.out.println("---第一只Y---");
        new Y();
        System.out.println("---第二只Y---");
        new Y();
    }
}