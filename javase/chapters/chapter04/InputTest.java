import java.util.Scanner; 

public class InputTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("=== 欢迎来到个人信息录入系统 ===");
        
        System.out.println("请输入你的名字：");
        String name = myScanner.next(); 
        
        System.out.println("请输入你的年龄：");
        int age = myScanner.nextInt();  
        
        System.out.println("请输入你的考试分数：");
        double score = myScanner.nextDouble(); 
        
        System.out.println("-----------------------");
        System.out.println("登记成功！" + name + 
            " 今年 " + age + " 岁，考了 " + score + " 分。");
    }
}