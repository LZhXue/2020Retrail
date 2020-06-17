import java.util.Scanner;

public class SanWeiShuQiuJie_1076 {

	/*
	 * 已知xyz+yzz=n，其中n是一个正整数，x、y、z都是数字（0-9），
	 * 编写一个程序求出x、y、z分别代表什么数字。如果无解，则输出“No Answer” 
	 * 注意：xyz和yzz表示一个三位数，而不是表示x*y*z和y*z*z。 
	 * 
	 * 输入 
	 * 输入一个正整数n。 
	 * 
	 * 输出
	 * 输出一行，包含x、y、z的值，每个数值占4列。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int flag = 0;
		for(int x = 1;x<=9;x++) {
			for(int y = 1;y<=9;y++) {
				for(int z = 0;z<=9;z++) {
					if(x*100+y*10+z+z+z*10+y*100==n) {
						flag = 1;
						System.out.printf("%4d%4d%4d",x,y,z);
					}
				}
			}
		}
		if(flag==0) {
			System.out.println("No Answer");
		}
	}

}
