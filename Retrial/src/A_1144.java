import java.util.Scanner;

public class A_1144 {
	/*
	 * 输入一个十进制整数n，转换成2、3、7、8进制输出 
	 * 要求程序定义一个dToK()函数，功能是将十进制数转化为k进制整数，其余功能在main()函数中实现。
	 * void dToK(int n, int k, char str[]) { //将n转化为k进制数，存入str }
	 * 
	 * 输入 
	 * 输入一个int范围内的正整数n
	 * 
	 * 输出 
	 * 输出为4行，分别是n对应的2、3、7、8进制数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char str[] = null;
		dToK(n,2,str);
		dToK(n,3,str);
		dToK(n,7,str);
		dToK(n,8,str);
	}
	public static void dToK(int n, int k, char str[]) {
		StringBuilder sb = new StringBuilder();
		while(n/k!=0) {
			sb.append(n%k);
			n = n/k;
		}
		sb.append(n%k);
		sb.reverse();
		str = sb.toString().toCharArray();
		System.out.println(str);
	}
}
