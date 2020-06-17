import java.util.Formatter;
import java.util.Scanner;

public class FailedRate_1044 {

	/*
	 * 题目描述 
	 * 输入n和n个学生成绩(实数），输出不及格率。
	 * 
	 * 输入 
	 * 输入的第一行是一个整数n，第二行是n个实数，用空格隔开。
	 * 
	 * 输出 
	 * 输出一个实数，表示不及格率，结果保留2位小数，单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double num = 0;
		for(int i = 0;i<n;i++) {
			if(scan.nextDouble()<60) {
				num++;
			}
			
		}
		Formatter fr = new Formatter().format("%.2f",num/n);
		System.out.println(fr);

	}

}
