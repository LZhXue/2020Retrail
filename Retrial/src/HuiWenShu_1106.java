import java.util.Scanner;

public class HuiWenShu_1106 {

	/*
	 * 题目描述 一个正整数，如果从左向右读（称之为正序数）和从右向左读（称之为倒序数）是一样的，这样的数就叫回文数。
	 * 输入两个整数m和n（m<n)，输出区间[m，n]之间的回文数。 
	 * 
	 * 输入
	 * 输入两个正整数m和n，输入保证m<n。 
	 * 
	 * 输出 
	 * 按从小到大的顺序，输出m到n之间的回文数，每个数后面有一个空格。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		for(int i = m;i<=n;i++) {
			String str = String.valueOf(i);
			int len = str.length();
			double sum = 0;
			for(int j = 0;j<len;j++) {
				sum = sum+Math.pow(10,j)*Integer.valueOf(str.charAt(j)-48);
			}
			if(sum==i) {
				System.out.print(i+" ");
			}
		}
	}

}
