import java.util.Scanner;

public class A_1212 {
	/*
	 * 题目描述
	 * 一个核电站有N个放核物质的坑，坑排列在一条直线上。如果连续３个坑中放入核物质，则会发生爆炸，于是，在某些坑中可能不放核物质。
	 * 现在，请你计算：对于给定的N，求不发生爆炸的放置核物质的方案总数。
	 * 
	 * 输入 
	 * 输入文件只有多行，每行对应一个正整数N＜＝４０；
	 * 
	 * 输出 
	 * 输出文件有多行，每行只有一个正整数，表示方案总数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(searchSolution(n,3));
		}
	}

	public static int searchSolution(int n, int m) {
		int f[] = new int[n+1];
		f[0] = 1;
		for (int i = 1; i <= n; i++) {

			if (i < m)//第i个坑道只有放或者不放2种情况
				f[i] = 2 * f[i - 1];
			if (i == m)////第i个坑道只有放或者不放2种情况,减去的1是前m坑道都放的情况，因为前面都放了，这个就只能空，只有一种情形
				f[i] = 2 * f[i - 1] - 1;
			if (i > m)/*有两种情况，前 i-1 个不发生爆炸，第 i 个可放可不放，f[i-1]*2
						但有种情况不知符合道要求，即第 i-m+1 ... i 个都放了（专最后 m 个不符合要求），但第 i-m ... i-1 是符合要求的
						所以当第 i-m 个没有放，第 i-m+1 ... i 个放了的情况下是多计算的，减去这部分（f[i-m-1]）即可*/
				f[i] = 2 * f[i - 1] - f[i - m - 1];
		}
		return f[n];
	}
}