import java.util.Scanner;

public class MonkeyPeach_1054 {
	/*
	悟空第一天摘下桃子若干，当即吃掉一半，还不过瘾，又多吃一个，第二天又将剩下的桃子吃掉一半多一个，
	以后每天吃掉前一天剩下的一半多一个，到第n天准备吃的时候只剩下一个桃子。聪明的你，请帮悟空算一下，
	他第一天开始吃的时候桃子一共有多少个呢？
	
	输入
	输入一个数n（1<=n<=30）。
	
	输出
	输出第一天的桃子个数。
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int xx[] = new int[30];
		xx[0] = 1;
		for(int i=1;i<30;i++) {
			xx[i] = xx[i-1]*2+2;
		}
		System.out.println(xx[n-1]);
	}

}
