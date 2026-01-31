
public class test02 {
    public static void main(String[] args) {
        // int i = 1;
        
        // // 第一行：普通的乘法赋值
        // i *= 0.1; //i = (int) i * 0.1;
        // System.out.println(i);//0
        
        // // 第二行：普通的赋值展开
        // // i = i * 0.1;//0.1
        // // System.out.println(i);
		// int a = 10;
		// int b = 20;
		// // 1. 先看 ++a 和 b-- (第二梯队)
		// // 2. 再看乘法 * (第三梯队)
		// // 3. 再看加法 + (第三梯队)
		// // 4. 最后看赋值 = (第五梯队)
		// int result = ++a + b-- * 2;//51
		// int x = 5;
		// int y = 5;

		// 步骤提示：
		// 1. 先看乘法部分：x++ * 2 (关键：这里的 x 用几去乘？)
		// 2. 乘完之后，x 变成了几？
		// 3. 再看加法部分：--y (先变还是先用？)
		// 4. 最后把两部分加起来。

		// int result = x++ * 2 + --y;//15
		// int a = 3;
		// int b = 4;

		// // 步骤提示：
		// // 1. a++ 是后加，先拿谁去乘 10 ？(记下乘法的结果)
		// // 2. 乘完这一步，a 变成几了？(记在旁边)
		// // 3. --b 是前减，b 变成几了？拿谁去加？
		// // 4. 最后把两边加起来。

		// int result = a++ * 10 + --b;
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(result);
		int x = 2;
		int y = 5;

		// 步骤提示：
		// 1. 先看 ++x：它是前加，x 变成几？(拿这个新值备用)
		// 2. 再看 y--：它是后减，先拿几去乘 3 ？
		// 3. 乘法算完是多少？
		// 4. y 此时变成几了？
		// 5. 最后做加法。

		int total = ++x + y-- * 3;
		System.out.println(x);
		System.out.println(y);
		System.out.println(total);
    }
}