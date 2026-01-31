// 请编写 BankSystem.java，模拟一个简单的银行账户交互。
// 需求文档：
	// 创建类 Account (账户)：
		// 属性：
			// name (String): 户主名
			// balance (double): 余额
			// pwd (String): 密码 (简单起见，用字符串)
		// 构造器：
			// 提供一个 3 参构造器，初始化这三个属性。
		// 方法 1：存钱 deposit
			// 参数：double money
			// 功能：把钱加到余额里，并打印“存款成功，当前余额为：xxx”。
		// 方法 2：取钱 withdraw
			// 参数：double money, String inputPwd
			// 功能：
				// 先判断密码对不对？不对打印“密码错误”。
				// 再判断余额够不够？不够打印“余额不足”。
				// 如果都OK，扣钱，并打印“取款成功，剩余余额：xxx”。
// 测试类 (Main)：
	// 创建一个账户：户主 "马云"，余额 1000.0，密码 "666666"。
	// 尝试存入 500.0。
	// 尝试取款 2000.0 (应该提示余额不足)。
	// 尝试取款 200.0 但密码输错 (应该提示密码错误)。
	// 尝试取款 200.0 且密码正确 (应该成功)。
// (提示：字符串比较相等，千万别用 ==，要用 inputPwd.equals(this.pwd) )
// 这是这一大章的“关底BOSS”，写完这个，我们就要进军“包”和“封装”了！加油！
public class BankSystem{
    public static void main(String[] args){
    	Account account = new Account("马云", 1000.0, "666666");
    	account.deposit(500.0);
    	account.withdraw(2000.0, "666666");
    	account.withdraw(200.0, "6666");
    	account.withdraw(200.0, "666666");
	}
}
class Account{
	String name;
	double balance;//余额
	String pwd;//密码
	public Account(String name, double balance, String pwd){
		this.name = name;
		this.balance = balance;
		this.pwd = pwd;
	}

	//方法 1：存钱 deposit
			// 参数：double money
			// 功能：把钱加到余额里，并打印“存款成功，当前余额为：xxx”。
	public double deposit(double money){
		balance += money;
		System.out.println("存款成功，当前余额为：" + balance);
		return balance;
	}

	// 方法 2：取钱 withdraw
			// 参数：double money, String inputPwd
			// 功能：
				// 先判断密码对不对？不对打印“密码错误”。
				// 再判断余额够不够？不够打印“余额不足”。
				// 如果都OK，扣钱，并打印“取款成功，剩余余额：xxx”。
	public double withdraw(double money, String inputPwd){
		if(!inputPwd.equals(this.pwd)){
			System.out.println("密码错误");	
			return balance;
		}
		
		if(balance < money){
			System.out.println("余额不足");
			return balance;
		}
		balance -= money;
		System.out.println("取款成功，剩余余额为：" + balance);
		return balance;
	}
}
