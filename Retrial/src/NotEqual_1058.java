import java.util.Scanner;

public class NotEqual_1058 {

	/*
	 * 已知不等式 1！+2！+3！+...+m！‹n,请编程对用户指定的n值计算并输出满足该不等式的m的整数解。 
	 * 
	 * 输入 
	 * 输入一个整数n，n为int范围内的正整型。
	 * 
	 * 输出 
	 * 输出m的取值范围，具体格式见输出样例。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		int m = 1;
		long cheng = 1;
		long sum = 0;
		while(sum<n) {
			
			cheng = cheng * m;
			m++;
			sum = sum+cheng;
			
		}
		System.out.println("m<="+(m-2));
	}

}
