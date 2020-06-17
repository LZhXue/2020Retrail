import java.util.Scanner;

public class DuoLieAaddB_1078 {

	/*
	 * 计算A+B 
	 * 输入 
	 * 输入第1行为一个整数n(1≤n≤10)，代表测试的组数。 
	 * 下面有n组测试数据，每组1行，为2个整数，为A, B。 
	 * 
	 * 输出
	 * 对每行输入，输出A+B的值，单独占一行。
	 */	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 for(int i = 0;i<n;i++) {
			 int a = scan.nextInt();
			 int b = scan.nextInt();
			 System.out.println(a+b);
		 }
	}

}
