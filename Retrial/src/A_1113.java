import java.util.Scanner;

public class A_1113 {

	/*
	 * 题目描述 如下程序的功能是计算Fibonacci数列的第n项。 函数fib()是一个递归函数。
	 * 请你改写该程序，计算第n项的同时，统计调用了多少次函数fib（包括main()对fib()的调用）。 #include<stdio.h> int
	 * fib(int k); int main(void ) { int n; scanf("%d", &n); printf("%d\n", fib(n));
	 * return 0; } int fib(int k) { if(k == 1 || k == 2) return 1; else return
	 * fib(k-1) + fib(k-2); }
	 * 
	 * 输入 输入一个正整数n。
	 * 
	 * 输出 输出包含两行，第一行是一个整数，表示第n项的值；第二行输出递归调用了多少次，具体格式见输出样例。
	 */
	public static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fib(n));
		System.out.println("递归调用了"+sum+"次");
		
	}

	public static int fib(int k) {
		sum++;
		if (k == 1 || k == 2)
			return 1;
		else
			return fib(k - 1) + fib(k - 2);
	}

}
