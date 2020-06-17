import java.util.Scanner;

public class A_1140 {

	/*
	 * 题目描述 给你一个小数x，让你算出小数点后第n位是什么，1 <= n <= 6。
	 * 
	 * 输入 首先输入一个t,表示有t组数据，跟着t行：
	 * 每行输入一个小数（输入数据保证一定是a.b的形式,总长度不超过100。为了简单化问题，没有循环小数的情况），然后跟一个n,表示小数点后第几位。
	 * 
	 * 输出 输出一个整数，表示小数点后第n位的数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			String arr[] = str.split(" ");
			int index = Integer.valueOf(arr[1]);
			String str1[] = arr[0].split("\\.");// 注意要用转义
			int cont = 0;
			if (str1[1].length() > 0) {
				char charr[] = str1[1].toCharArray();
				if (index > charr.length) {
					cont = 0;
				} else {
					cont = (int) (charr[index - 1] - 48);
				}
			}
			System.out.println(cont);
		}
//		int ch = '9';//0:48 9:57
//		System.out.println(ch);
	}

}
