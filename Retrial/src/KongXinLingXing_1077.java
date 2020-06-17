import java.util.Scanner;

public class KongXinLingXing_1077 {

	/*
	 * 题目描述 
	 * 输入一个整数n，（1<=n<=20）,输出一个空心菱形，其中每个边由n个'*'组成。 
	 * 
	 * 输入 
	 * 输入包含一个整数,n（1<=n<=20） 
	 * 
	 * 输出
	 * 输出一个空心菱形，每个边由n个'*'组成
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1-n;i<n;i++)
		{
			for(j=1-n;j<n;j++)
			{
				if(Math.abs(i)+Math.abs(j)==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		sc.close();
		
	}

}
