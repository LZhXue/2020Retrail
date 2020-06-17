import java.util.Scanner;

public class LuckyNumber_1056 {

	/*
	 * 小明对某些数字有偏爱，例如，他喜欢7的倍数，而不喜欢4的倍数，如果一个整数是7的倍数，而不是4的倍数，小明会认为这个数字是他的幸运数字。
	 * 现在给定两个整数m和n，请你帮小明找m到n范围内的最大的幸运数字。如果m到n范围内没有幸运数字，则输出“no” 
	 * 
	 * 输入 
	 * 两个正整数m和n（m <=n，且均小于10的9次方） 
	 * 
	 * 输出 
	 * 一个整数，即m到n范围内的最大的幸运数字。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int flag = 0;
		for(int i = n;i>=m;i--) {
			if(i%7==0&&i%4!=0) {
				flag = 1;
				System.out.println(i);
				break;
			}
		}
		if(flag==0) {
			System.out.println("no");
		}
	}

}
