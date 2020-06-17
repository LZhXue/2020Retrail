import java.util.Scanner;

public class JieChengTable_1048 {

	/*
	 * 输入一个正整数n(n<=20)，输出1到n之间阶乘表。 
	 * 
	 * 输入 
	 * 输入只有一个正整数n。 
	 * 
	 * 输出
	 * 输出1到n之间的阶乘表，格式见输出样例。
	 * 每行两个数据，第一个数据占4列，第二个数据占20列，左对齐。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long  n = scan.nextInt();
		long jiecheng = 1;
		for(long i = 1;i<n+1;i++) {
			jiecheng = jiecheng*i;
			System.out.printf("%-4d%-20d\n",i,jiecheng);
		}
	}

}
