// 背景： 现在你是包工头，客户问你：“把 30 个盘子从 A 搬到 C，
// 总共需要搬多少次？” 每搬动一次盘子，算 1 次工作量。
// 需求： 请编写 Recursion06.java，在 Tower 类中修改 move 方法
// （或者新建一个 getMoves 方法）：
// 参数：int num (盘子数量)。
// 返回值：int (总共需要移动多少次)。
// 核心逻辑：
// 如果只有 1 个盘子，需要移动 1 次。
// 如果有多个盘子：
// 第一步（移走上面 num-1 个）：需要多少次？（递归算）
// 第二步（移走底下 1 个）：需要 1 次。
// 第三步（移回上面 num-1 个）：需要多少次？（递归算）
// 总次数 = 第一步次数 + 1 + 第三步次数。
// 测试：
// 计算 3 个盘子需要几次？（答案应该是 7）
// 计算 10 个盘子需要几次？
// 
public class Recursion06{
	public static void main(String[] args){
		Tower tower = new Tower();
		int moves = tower.getMoves(5);
		System.out.println("需要移动次数 = " + moves);
	}
}

class Tower{
	//num盘子数量
	public int getMoves(int num){
	//如果只有 1 个盘子，需要移动 1 次。
	// 如果有多个盘子：
	// 第一步（移走上面 num-1 个）：需要多少次？（递归算）
	// 第二步（移走底下 1 个）：需要 1 次。
	// 第三步（移回上面 num-1 个）：需要多少次？（递归算）
	// 总次数 = 第一步次数 + 1 + 第三步次数。

		if(num == 1){
			return 1;
		}else{
			return getMoves(num - 1) + 1 + getMoves(num - 1);
		}
	}
}