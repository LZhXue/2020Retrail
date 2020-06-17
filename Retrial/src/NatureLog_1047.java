import java.util.Formatter;
import java.util.Scanner;

public class NatureLog_1047 {

	/*
	 * 输入两个正整数m和n，输出m到n之间每个整数的自然对数。 
	 * 
	 * 输入 
	 * 输入包括两个整数m和n(m<=n)，之间用一个空格隔开。
	 * 
	 * 输出 
	 * 每行输出一个整数及其对数，整数占4列，对数占8列，右对齐，对数保留4位小数。
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		for(int i = n;i<=m;i++) {
			double log = Math.log(i);
			System.out.printf("%4d%8.4f\n",i,log);//右对齐，对数保留4位小数。
			
			
		}
	}

}
