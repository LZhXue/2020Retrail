import java.util.Formatter;
import java.util.Scanner;

public class ShuLie3_1042 {
	/*
	 * 求1-2/3+3/5-4/7+5/9-6/11+...的前n项和，结果保留3位小数。 
	 * 
	 * 输入 
	 * 输入正整数n(n>0)。 
	 * 
	 * 输出
	 * 输出一个实数，保留3位小数，单独占一行。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 0;
		double fz = 1;
		double fm = 1;
		for(int i = 0;i<n;i++) {
			if(i%2==0) {
				sum = sum+fz/fm;
			}else {
				sum = sum-fz/fm;
			}
			fz+=1;
			fm+=2;
		}
		Formatter fs = new Formatter().format("%.3f",sum);
		System.out.println(fs);
	}

}
