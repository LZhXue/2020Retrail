import java.util.Scanner;

public class IsSuShu_1057 {
	/*
	 * 题目描述 输入一个正整数n，判断n是否是素数，若n是素数，输出”Yes”,否则输出”No”。
	 * 
	 * 输入 输入一个正整数n(n<=1000)
	 * 
	 * 输出 如果n是素数输出"Yes"，否则输出"No"。输出占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int flag = 0;
		if (n == 1) {
			System.out.println("No");
			flag = 1;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println("No");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println("Yes");
		}
	}

}
