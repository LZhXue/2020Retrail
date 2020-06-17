import java.util.Scanner;

public class BaiQianMaiBaiJi_1074 {
	/*
	 * 百钱买百鸡问题：公鸡五文钱一只，母鸡三文钱一只，小鸡三只一文钱，用100文钱买100只鸡，公鸡、母鸡、小鸡各买多少只？
	 * 本程序要求解的问题是：给定一个正整数n，用n文钱买n只鸡，问公鸡、母鸡、小鸡各买多少只？ 
	 * 
	 * 输入 
	 * 输入一个正整数n(n<=100)。 
	 * 
	 * 输出
	 * 如果有解，种组合占一行，包含公鸡、母鸡、小鸡的个数，用正整数表示，每个数据占4列。右对齐
	 * 公鸡母鸡小鸡个数均大于等于0，按公鸡数目从小到大输出，
	 * 公鸡数目相同按母鸡数目从小到大输出，以此类推。
	 * 如果无解，输出“No Answer”。
	 */	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int flag = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				for(double k = 0;k<n;k++) {
					if((5*i+3*j+k/3)==n&&(i+j+k==n)) {
						System.out.printf("%4d%4d%4.0f\n",i,j,k);
						flag = 1;
					}
				}
			}
		}
		if(flag==0) {
			System.out.println("No Answer");
		}
	}

}
