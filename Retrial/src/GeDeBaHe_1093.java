import java.util.Scanner;

public class GeDeBaHe_1093 {

	/*
	 * 输入 
	 * 一个偶数M (M是6到1000000之间的一个偶数). 
	 * 
	 * 输出
	 * 输出和等于该偶数的所有素数对a和b，按a递增的顺序输出，(a,b)和(b,a)被视为同一个素数对。
	 */
	public static void main(String[] args) {
		// long的最大值9223372036854775807
		//int最大值2147483647
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		for(int i = 1;i<=m/2;i++) {
			if(prime(i)==1&&prime(m-i)==1) {
				System.out.println(i+" "+(m-i));
			}
		}
		
	}
	public static int prime(int x) {
		
		if(x==1) {
			return 0;
		}
		for(int i = 2;i<=Math.sqrt(x);i++) {
			if(x%i==0) {
				return 0;
			}
		}
		return 1;
	}
}
