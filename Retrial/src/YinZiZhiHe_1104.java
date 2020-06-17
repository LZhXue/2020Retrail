import java.util.Scanner;

public class YinZiZhiHe_1104 {

	/*
	 * 题目描述 
	 * 输入正整数n（2<=n<=1000），计算并输出n的所有正因子(包括1，不包括自身)之和。要求程序定义一个FacSum
	 * ()函数和一个main()函数，FacSum ()函数计算并返回n的所有正因子之和，其余功能在main()函数中实现。 int FacSum(int n)
	 * { //计算n的所有正因子(包括1，不包括自身)之和sum，本函数返回sum } 
	 * 
	 * 输入 
	 * 输入正整数n（2<=n<=1000）。 
	 * 
	 * 输出
	 * 输出n的所有正因子(不包括自身)之和。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(FacSum(n));
	}
	public static int FacSum(int n)
	{
		int sum=0,i;
		for(i=1;i<n;i++)
		{
			if(n%i==0) sum=sum+i;
		}
		return(sum);
	}
}
