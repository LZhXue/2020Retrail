import java.util.Scanner;

public class A_1239 {
	/*
	 * 题目描述
	 * 如果一个字符串能由k个相同的字符串相连接组成,那这个字符串就叫做K-String.例如:字符串aabaabaabaab即是1-String,又是2-
	 * String,也是4-String。很显然,对于任何一个字符串来说,它都是 1-String.
	 * 现在给一个字符串S(仅包含小写英文字母)和一个整数K,你的任务是重新排列S,使它变成一个K-String.
	 * 
	 * 输入 
	 * 输入包含N组测试实例,每组实例占两行,第一行是一个整数K(1 <= K <= 1000).第二行是字符串S.S的长度在1-1000之间.
	 * 
	 * 输出 
	 * 每组实例输出占一行,判断字符串S通过重新排列之后能否变成一个K-String,如果可以输出Yes,否则输出No.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0;i<n;i++) {
			int k = scan.nextInt();
			scan.nextLine();
			String str = scan.nextLine();
			int standard[] = new int[26];
			for(int j = 0;j<str.length();j++) {
				int temp = str.charAt(j)-97;
				standard[temp]++;

			}
			boolean flag = true;
			for(int m = 0;m<26;m++) {
				if(standard[m]%k!=0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
