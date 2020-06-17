import java.util.Scanner;

public class A_1217 {
	/*
	 * 题目描述 
	 * 有一堆正整数，统计其中有多少立方数。
	 * 
	 * 输入 
	 * 输入数据有一些正整数，其每个数都小于2^32。若该数为0，则应结束统计。
	 * 
	 * 输出 
	 * 输出所统计的立方数个数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		while(num!=0) {
			boolean flag = true;
			if(num==1) {
				sum++;
			}
			for(int i = 1;i<Math.sqrt(num);i++) {
				if(i*i*i==num) {
					flag = false;
					sum++;
				}
			}
			num = scan.nextInt();
		}
		System.out.println(sum);
	}
//	public static boolean isCube(int n) {
//		boolean flag = true;
//		if(n==1) {
//			return true;
//		}
//		for(int i = 1;i<n/3;i++) {
//			if(i*i*i==n) {
//				flag = false;
//				return true;
//			}
//		}
//		if(flag) {
//			return false;
//		}
//		return false;
//	}
}
