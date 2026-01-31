// 14.扩展题，学员自己做.Homework14.java
// 有个人Tom设计他的成员变量。成员方法，可以电脑猜拳。电脑每次都会随机生成0，1，2
// 0表示石头1表示剪刀2表示布
// 并要可以显示Tom的输赢次数（清单）

import java.util.Random;
import java.util.Scanner;
public class Homework14{
    // 测试
    public static void main(String[] args) {
        // 创建一个玩家对象
        Tom player = new Tom();
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎来到剪刀石头布游戏！");
        System.out.println("游戏规则：0-拳头，1-剪刀，2-布");

        int roundMax = 3;
        for(int round = 1; round <= roundMax; round++){
            System.out.println("\n第 " + round + " 回合开始：");

        //获取玩家出拳
        int playerChoice = -1;
        while(true){
            try{
                System.out.print("请输入你的选择(0-拳头，1-剪刀，2-布)：");
                playerChoice = scanner.nextInt();
                if(playerChoice >= 0 && playerChoice <= 2){
                    break;
                } else {
                    System.out.println("输入错误，请输入0、1或2！");
                }
            } catch (Exception e){
                    System.out.println("输入无效，请重新输入数字！");
                    scanner.next();
                }
            }

            //设置玩家选择并获取电脑选择
            player.setPlayerChoice(playerChoice);
            int computerChoice = player.computerChoice();

            //判断胜负
            String result = player.judge();

            //显示本回合结果
            System.out.println("你的选择：" + getChoiceName(playerChoice));
            System.out.println("电脑的选择：" + getChoiceName(computerChoice));
            System.out.println("结果：" + result);
        }

        //显示最终统计结果
        System.out.println("\n====游戏结束====");
        System.out.println("总回合数：" + roundMax);
        System.out.println("你的胜利次数：" + player.getWinCount());
        System.out.println("你的失败次数：" + player.getLoseCount());
        System.out.println("平局次数：" + player.getDrawCount());

        scanner.close();
    }

    //辅助方法：将数字转换为对应的出拳名称
    private static String getChoiceName(int choice){
        switch(choice){
            case 0 : return "石头";
            case 1 : return "剪刀";
            case 2 : return "布";
            default : return "未知";
        }
    }
}

// Tom类
class Tom {// 核心代码
    // 玩家出拳的类型
    int playerChoice; //0,1,2
    // 电脑出拳的类型
    int computerChoice; //0,1,2
    // 玩家赢的次数
    int winCount;
    int loseCount;
    int drawCount;
    // 比赛的次数
    //int count = 1;   //一共比赛3次

    /**
     * 电脑随机生成猜拳的数字的方法
     * @return
     */
    public int computerChoice() {
        Random random = new Random();
        computerChoice = random.nextInt(3);// 方法 返回 0-2的随机数
        return computerChoice;
    }

    /**
     * 设置玩家猜拳的数字的方法
     * @param tomGuessNum
     */
    public void setPlayerChoice(int choice) {
        //if (tomGuessNum > 2 || tomGuessNum < 0) {
        // 抛出一个异常, 李同学会写，没有处理
        //     throw new IllegalArgumentException("数字输入错误");
        // }
        this.playerChoice = choice;
    }

    /**
     * 比较猜拳的结果
     * @return 玩家赢返回true，否则返回false
     */
    public String judge() {
        //比较巧
         if(playerChoice == computerChoice){
            drawCount++;
            return "平局";
         }else if((playerChoice == 0 && computerChoice == 1) ||
                  (playerChoice == 1 && computerChoice == 2) ||
                  (playerChoice == 2 && computerChoice == 0)){
            winCount++;
            return "你赢了";
         } else {
            loseCount++;
            return "你输了";
        }
    }
    /**
     * * 记录玩家赢的次数
     * * @return
     * */
    public int getWinCount() {
        return winCount;
    }

    //获取失败次数
    public int getLoseCount() {
        return loseCount;
    }

    //获取平局次数
    public int getDrawCount() {
        return drawCount;
    }
}