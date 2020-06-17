import java.util.Formatter;
import java.util.Scanner;

public class BankRate_1016 {
	/*
	 * 题目描述 
	 * 设银行1年期定期存款年利率为2.25%，存款本金为deposit元，试编程计算并输出n年后的本利之和。
	 * 
	 * 输入 
	 * 输入一个正整数和一个实数，分别代表存款年数和存款本金。
	 * 
	 * 输出 
	 * 输出一个双精度实数，小数点后保留6位有效数字。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		double dep = scan.nextDouble();
		double rate = 0.0225;
		for(int i =0;i<year;i++) {
			dep = dep+dep*rate;
		}
		Formatter fd = new Formatter().format("%.6f",dep);
		System.out.println(fd);
	}

}
