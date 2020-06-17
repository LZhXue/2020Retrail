import java.util.Scanner;

public class OddMulti_1046 {

	/*
	 * 给你n个整数，求他们中所有奇数的乘积。 
	 * 
	 * 输入 
	 * 第一个数为n，表示本组数据一共有n个，接着是n个整数，你可以假设每组数据必定至少存在一个奇数。 
	 * 
	 * 输出
	 * 输出n个数中的所有奇数的乘积，占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int mul = 1;
		for(int i = 0;i<n;i++) {
			int x = scan.nextInt();
			if(x%2!=0) {
				mul = mul*x;
			}
		}
		System.out.println(mul);
	}

}
