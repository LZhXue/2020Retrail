import java.util.Scanner;

public class Shulie4_1052 {
	/*
	 * 输入n和a，求a+aa+aaa+…aa…a(n个a)，
	 * 如当n=3,a=2时，2+22+222的结果为246 
	 * 
	 * 输入
	 * 包含两个整数，n和a,含义如上述，你可以假定n和a都是小于10的非负整数 
	 * 
	 * 输出 
	 * 输出前n项和，单独占一行
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n = scan.nextInt();
		int a =scan.nextInt();
		int b = a;
		for(int i = 0;i<n;i++) {
			sum = sum+a;
			a = b+10*a;
		}
		System.out.println(sum);
	}

}
