// MiGong.java
// 递归调用应用实例-迷宫问题
// 1.小球得到的路径，和程序员设置的找路策略有关即：找路的上下左右的顺序相关
// 2.再得到小球路径时，可以先使用（下右上左），再改成（上右下左），看看路径是不是有变化
// 3.测试回溯现象
// 4.扩展思考：如何求出最短路径？
public class MiGong{
	public static void main(String[] args){
		//1.先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
		//2.先规定map 数组的元素值：0 表示可以走，1 表示障碍物
		
		int[][] map = new int[8][7];
		//3.将最上面的一行和最下面的一行，全部设置为1
		for(int i = 0; i < 7; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4.将最右侧的一列和最左侧的一行，全部设置为1
		for(int i = 0; i < 8; i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;

		//输出当前的地图
		System.out.println("====当前地图情况====");
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}
		//使用findWay 给老鼠找路
		T t1 = new T();
		//下右上左
		t1.findWay(map, 1, 1);
		System.out.println("====找路的情况如下====");
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}
	}
}
class T{
	//使用递归回溯的思想来解决老鼠出迷宫
	//
	//1.findWay 方法就是专门来找出迷宫的路径
	//2.如果找到，就返回true，否则返回false
	//3.map 就是二维数组，即表示迷宫
	//4.i,j 就是老鼠的位置，初始化的位置为(1,1)
	//5.因为是递归找路，所以先规定map 数组的各个值的含义
	//  0 表示没走过的通路，1 表示障碍物，2 表示走过且走得通的路，
	//  3 表示走过，但走不通是死路
	//6.当map[6][5] = 2 就说明找到通路，就可以结束，否则继续找
	//7.先确定老鼠找路的策略 下->右->上->左
	//
	public boolean findWay(int[][] map, int i, int j){
	    if (map[6][5] == 2) {//说明已经找到
	        return true; 
	    } else {
	    	if(map[i][j] == 0){//当前位置为0 ，说明可以走
	    		//假定走得通
	    		map[i][j] = 2;
	    		//使用找路策略，来确定该位置是否真的可以走通
	    		// 下->右->上->左
	    		if(findWay(map, i + 1, j)){//先走下
	    			return true;
	    		}else if(findWay(map, i, j + 1)){//右
	    			return true;
	    		}else if(findWay(map, i - 1, j)){//上
	    			return true;
	    		}else if(findWay(map, i, j -1)){//左
	    			return true;
	    		}else{
	    			map[i][j] = 3;
	    			return false;
	    		}
	    	}else{//map[i][j] = 1, 2, 3
	    		return false;
	    	}
	    
	    }
	}
}