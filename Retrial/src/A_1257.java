import java.util.Arrays;
import java.util.Scanner;

public class A_1257 {
	/*
	 * 输入 输入有多组测试数据。 每组测试数据包括3行： 第一行输入N(1≤N≤1000)。表示马的数量。 第二行有N个整型数字，即渊子的N匹马的速度。
	 * 第三行有N个整型数字，即对手的N匹马的速度。 当N为0时退出。
	 * 
	 * 输出 若通过聪明的你精心安排，如果渊子能赢得比赛，那么输出“YES”。 否则输出“NO”。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			int yuanzi[] = new int[n];
			int duishou[] = new int[n];
			for (int i = 0; i < n; i++) {
				yuanzi[i] = scan.nextInt();
			}
			for (int i = 0; i < n; i++) {
				duishou[i] = scan.nextInt();
			}
			Arrays.parallelSort(yuanzi);
			Arrays.parallelSort(duishou);
			int indexyuan = 0;
			int indexdui = 0;
			int sum = 0;
			while (indexyuan < n && indexdui < n) {
				if (yuanzi[indexyuan] > duishou[indexdui]) {
					sum++;
					indexyuan++;
					indexdui++;
				} else {
					indexyuan++;
				}
			}
			if (sum > n / 2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			n = scan.nextInt();
		}
	}

}
