import java.util.Scanner;

public class JudgeOddOrEven_1018 {
	/*
	 * 输入一个整数，判断该数是奇数还是偶数。 
	 * 输入 
	 * 输入整数n。
	 * 输出 
	 * 如果该数是奇数就输出“odd”，偶数就输出“even”（输出不含双引号）。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		if(m%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}

}
