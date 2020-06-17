import java.util.Scanner;

public class A_1128 {
	/*
	 * 题目描述 
	 * 期末考试结束，班主任拿到了本班学生的成绩汇总表，
	 * 由m行n列组成(本班共有m名学生，本学期有n门课程),每行是一个同学的n门课程成绩，请编写程序，
	 * 计算并输出每门课的平均分，结果保留2位小数。 
	 * 
	 * 输入 
	 * 第一行是两个整数m和n，表示本班的人数和本学期课程数目，0<m<=1000，0<n<=10。
	 * 接下来是成绩单，有m行，每行n个实数。 
	 * 
	 * 输出 
	 * 输出一行，有n个实数，保留两位小数，表示每门课的平均分，用空格隔开。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		double sub[] = new double[n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				double score = scan.nextDouble();
				sub[j] = sub[j]+score;
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.printf("%.2f"+" ",sub[i]/m);
		}
	}

}
