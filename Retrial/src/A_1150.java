import java.util.Scanner;

public class A_1150 {
	/*
	 * 题目描述 小明的老师给小明出了一道题目：数数一篇文章出现了多少个数字，请你帮帮他吧。
	 * 
	 * 输入 输入一个字符串，由空格、英文字母、数字组成，以回车结束，长度小于1000。
	 * 
	 * 输出 输出整数个数(不是数字字符个数哦)。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, flag = 1;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9') {
				if (flag == 1)
					sum++;
				if (arr[i] != '0')
					flag = 0;
			} else
				flag = 1;
		}
		System.out.println(sum);
	}

}
