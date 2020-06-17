import java.util.Formatter;
import java.util.Scanner;

public class Average_1009 {
	/*
	 * 题目描述 
	 * 已知某位学生的数学、英语和计算机课程的成绩，求该生三门课程的平均分。
	 * 
	 * 输入 
	 * 输入三个整数，数据之间由空格隔开。
	 * 
	 * 输出 
	 * 输出占一行，包含一个实数，为三门课的平均分，保留两位小数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x =scan.nextInt(),y = scan.nextInt(),z = scan.nextInt();
		Formatter f = new Formatter().format("%.2f",(x+y+z)/3);
		System.out.println(f);
		
	}

}
