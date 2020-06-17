import java.util.Scanner;

public class A_1249 {
	/*
	 * 题目描述 期末考试结束了，Ms.White拿到一个班级的成绩册，本班级有n个学生，本学期有m门课程，每个学生每门课的成绩是1到9之间的一个整数。
	 * 如果某个学生的某一门课程得了该课程的最高分（最高分可以不唯一），则可以说该学生在该课程上是最优的。如果一个学生至少在一门课程上是最优的，Mr.White就认为该学生是成功的。Mr.White想知道在他的班上有多少学生是成功的。你能帮帮他吗？
	 * 
	 * 输入 
	 * 输入第一行是两个整数n和m(1 <= n,m <= 100)，n是学生人数，m是课程数；接下来n行，每行包含m个数字，表示一个学生的m门课程的成绩，数据之间用空格隔开。
	 * 
	 * 输出 
	 * 输出一个整数，表示班级中成功学生的人数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();// 学生人数
		int m = scan.nextInt();// 课程数
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int standard[] = new int[m];
		for (int i = 0; i < m; i++) {
			int max = -1;
			for (int j = 0; j < n; j++) {
				if (max < arr[j][i]) {
					max = arr[j][i];
				}
			}
			standard[i] = max;
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == standard[j]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
