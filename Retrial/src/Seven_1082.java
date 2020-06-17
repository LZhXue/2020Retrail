import java.util.Scanner;

public class Seven_1082 {

	/*
	 * 题目描述 输出7和7的倍数，还有包含7的数字例如（17，27，37...70，71，72，73...）
	 * 
	 * 输入 首先输入一个整数t，表示有t组数据。 然后有t行，每行一个整数N。(N不大于30000)
	 * 
	 * 输出 对于每组数据，输出从小到大排列的不大于N的与7有关的数字。每组数据占一行，每个数字后面有一个空格；
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			for (int j = 1; j <=n; j++) {
				if (j % 7 == 0) {
					System.out.print(j + " ");
				} else {
					int temp = j;
					while (temp > 0) {
						if (temp % 10 == 7) {
							System.out.print(j + " ");
							break;
						}
						temp = temp / 10;
					}
				}
				if(j==n) {
					System.out.println();
				}
				
			}
		}
	}

}
