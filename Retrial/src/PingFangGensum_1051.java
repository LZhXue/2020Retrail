import java.util.Scanner;

public class PingFangGensum_1051 {

	/*
	 * 数列的定义如下： 数列的第一项为item，以后各项为前一项的平方根，求数列的前n项的和。
	 * 
	 * 输入
	 * 由两个整数item（item<10000）和n(n<1000)组成，item和n的含义如前所述。 
	 * 
	 * 输出
	 * 输出该数列的和，占一行，要求精度保留2位小数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double item = scan.nextInt();
		int n = scan.nextInt();
		double sum = 0;
		for(int i = 0;i<n;i++) {
			sum = sum+item;
			item = Math.sqrt(item);
		}
		System.out.printf("%.2f",sum);
	}

}
