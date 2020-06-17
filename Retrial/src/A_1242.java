import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A_1242 {
	/*
	 * 题目描述 这个A-B求的是两个集合的差，就是做集合的减法运算。（当然，大家都知道集合的定义，就是同一个集合中不会有两个相同的元素，这里还是提醒大家一下）
	 * 
	 * 输入
	 * 每组输入数据占1行,每行数据的开始是2个整数n(0<=n<=100)和m(0<=m<=100),分别表示集合A和集合B的元素个数，然后紧跟着n+m个元素，
	 * 前面n个元素属于集合A，其余的属于集合B. 每个元素为不超出int范围的整数,元素之间有一个空格隔开. 如果n=0并且m=0表示输入的结束，不做处理。
	 * 
	 * 输出 针对每组数据输出一行数据,表示A-B的结果,如果结果为空集合，则输出“NULL”,否则从小到大输出结果,为了简化问题，每个元素后面跟一个空格.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			int nn[] = new int[n];
			int mm[] = new int[m];
			for (int i = 0; i < n; i++) {
				nn[i] = scan.nextInt();
			}
			for (int i = 0; i < m; i++) {
				mm[i] = scan.nextInt();
			}
			Arrays.parallelSort(nn);
			Arrays.parallelSort(mm);
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				boolean flag = true;
				for (int j = 0; j < m; j++) {
					if (nn[i] == mm[j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					al.add(nn[i]);
				}
			}
			if (al.size() == 0) {
				System.out.print("NULL");
			} else {
				for (int p = 0; p < al.size(); p++) {
					System.out.print(al.get(p) + " ");
				}
			}
			System.out.println();
		}
	}

}
