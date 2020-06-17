import java.util.Scanner;

public class A_1213 {
	/*
	 * 题目描述 ACM公司生产金币的设备出了问题，使得最近生产的10批金币的重量出现了波动：本来金币的标准重量是10克，但现在有的可能是11克，有的可能9克，
	 * 也有可能是10克。 现在只知道同一批金币的重量是相同的，你的任务是要把每批的单枚金币的重量找出来。 你的设备有一个电子秤，但只允许称量一次！
	 * 你从第1批中取1枚金币，第2批取3枚，...第i批取3^(i−1)枚...，第10批取3^9枚，总共29524枚。将这29524枚金币放在电子秤上，
	 * 得到了总重量，就交给你的程序去！
	 * 
	 * 输入 有多个测试序列，每个测试序列一行，包含一个6位的正整数W(265716≤W≤324764)，表示29524枚金币的总重量
	 * 
	 * 输出 每个测试序列输出一行，包含10个用空格分开的正整数，分别表示10批金币的单枚重量，注意行尾没有空格。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			n = n - 265716;
			for (int i = 0; i < 10; i++) {//每次取余3即是每枚多出的质量
				if (i == 9)//最后一行输出答案+回车
					System.out.printf("%d\n", 9 + n % 3);
				else//其他行输出答案+空格
					System.out.printf("%d ", 9 + n % 3);
				n /= 3;
			}
		}

	}

}
