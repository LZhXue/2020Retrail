import java.util.Scanner;

public class FriendlyNum_1105 {

	/*
	 * 输入两个正整数m和n，顺序输出m到n之间的所有友好数对。
	 * 如果两个整数的所有正因子之和（包括1，不包括自身）等于对方，就称这对数是友好的。例如：1184和1210是友好数对，因为
	 * 1184的因子之和为1+2+4+8+16+32+37+74+148+296+592=1210
	 * 1210的因子之和为1+2+5+10+11+22+55+110+121+242+605=1184 
	 * int facsum (int n) { //计算n的所有正因子之和sum，本函数返回sum } 
	 * 
	 * 输入 
	 * 输入两个正整数m和n，1<m<=n<=10000。 
	 * 
	 * 输出
	 * 输出m和n之间的所有友好数对。
	 * 在输出每个友好数对时，要求小数在前、大数在后，并去掉重复的数对。例如，220和284是一对友好数，而284和220也是一对友好数，
	 * 此时只需输出220和284这对友好数。每个友好数对占一行，两数之间用空格隔开。 如果m和n之间没有友好数对，则输出“No answer”。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
//这样的写法严重超时
//		int flag = 0;
//		for(int i = m;i<=n;i++) {
//			for(int j = i+1;j<=n;j++) {
//				if((facsum(i)==j)&&(facsum(j)==i)) {
//					flag = 1;
//					System.out.println(i+" "+j);
//				}
//			}
//		}
//		if(flag==0) {
//			System.out.println("No answer");
//		}
		int j=0;
		for(int i=m;i<=n;i++)
		{
			if(facsum(facsum(i))==i && facsum(i)>i && facsum(i)<=n)
			{
				System.out.println(i+" "+facsum(i));
				j++;
			}
		}
		if(j==0) System.out.println("No answer");

	}
	public static int facsum (int n) {
		int sum = 0;
		for(int i = 2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				sum = sum+i+n/i;
			}
		}
		return sum+1;
	}
}
