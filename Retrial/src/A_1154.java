import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_1154 {
	/*
	 * 题目描述 
	 * 某校大门外长度为L 的马路上有一排树，每两棵相邻的树之间的间隔都是1 米。我们可以把马路看成一个数轴，马路的一端在数轴0 的位置，另一端在L
	 * 的位置；数轴上的每个整数点，即0，1，2，……，L，都种有一棵树。
	 * 由于马路上有一些区域要用来建地铁。这些区域用它们在数轴上的起始点和终止点表示。已知任一区域的起始点和终止点的坐标都是整数，区域之间可能有重合的部分。
	 * 现在要把这些区域中的树（包括区域端点处的两棵树）移走。你的任务是计算将这些树都移走后，马路上还有多少棵树。
	 * 
	 * 输入 
	 * 输入第一行是一个整数N，表示有N组测试数据。
	 * 每组测试数据的第一行有两个整数L（1 <= L <= 10000）和 M（1 <= M <= 100），L 代表马路的长度，M 代表区域的数目，L 和M之间用一个空格隔开。
	 * 接下来的M 行每行包含两个不同的整数，用一个空格隔开，表示一个区域的起始点和终止点的坐标。
	 * 
	 * 输出 
	 * 输出包括N行，每行只包含一个整数，表示马路上剩余的树的数目。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i = 0;i<N;i++) {
			int L = scan.nextInt();//长度L
			int M = scan.nextInt();//区域数M
			Set setL = new HashSet();
			for(int l = 0;l<=L;l++) {
				setL.add(l);
			}
			for(int j = 0;j<M;j++) {
				int start = scan.nextInt();
				int end = scan.nextInt();
				for(int k = start;k<=end;k++) {
					if(setL.contains(k)) {
						setL.remove(k);
					}
				}
			}
			System.out.println(setL.size());
		}
	}

}
