import java.util.Scanner;

public class For08 {
    public static void main(String[] args) {
        // 1. Scanner 提到外面，只造一次
        Scanner myScanner = new Scanner(System.in);
//     这个 “定义布尔变量 -> 循环中修改 -> 循环后判断” 的模式，
//     是编程里处理“多伦尝试”问题的标准答案。
// 一定要把这个模式记下来，以后不管是做游戏（3条命）、做支付（3次密码），全都要用到它！
        // 2. 定义一个开关变量 (Flag)
        // 默认是 false，表示还没登录成功
        boolean isSuccess = false; 

        // 3. 循环 3 次
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String name = myScanner.next();
            System.out.println("请输入密码：");
            // 密码建议也用 String，防止 007 这种密码被识别成 7
            String password = myScanner.next(); 

            // 4. 核心判断
            if ("admin".equals(name) && "123".equals(password)) {
                System.out.println("恭喜你，登录成功！");
                
                // 关键动作：把开关打开！
                isSuccess = true; 
                
                // 登录成功了，剩下的次数不用试了，直接跳出循环
                break; 
            } else {
                // 计算剩余次数
                int count = 3 - i; 
                if (count > 0) {
                    System.out.println("登录失败，你还有 " + count + " 次机会");
                }
            }
        }

        // 5. 循环结束后，检查开关
        // 如果开关还是 false，说明 3 次机会都用完了，也没 break 出来
        if (isSuccess == false) {  // 也可以写成 if (!isSuccess)
            System.out.println("机会用尽，账号已锁定，请明天再来！");
        }
    }
}