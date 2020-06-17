import java.util.Formatter;
import java.util.Scanner;

public class JueDuiZhi_1012 {
	/*
	 * 题目描述 
	 * 求实数的绝对值。
	 * 
	 * 输入 
	 * 输入一个实数。
	 * 
	 * 输出 
	 * 输出它的绝对值，结果保留两位小数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double m = scan.nextDouble();
		if(m>=0) {
			m = m;
		}else {
			m = m*(-1);
		}
		Formatter fm = new Formatter().format("%.2f",m);
		System.out.println(fm);
	}

}
