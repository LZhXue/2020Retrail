import java.util.Scanner;

public class A_1226 {
	/*
	 * 题目描述 已知两个整数数组f[]和g[]，它们的元素都已经从小到大排列。例如f[]中可能有1，2，2，3，3，g[]中有1，2，2，2，3。
	 * 请写一个程序，算出这两个数组彼此之间有多少组相同的数据。 就以上例而言: f[0]于g[0]是第一组；
	 * f[1]于g[1]是第二组；f[2]于g[2]是第三组； f[3]于g[4]是第四组。
	 * 
	 * 输入 第一行为两个整数m, n(1≤m, n≤1000)，分别代表数组f[], g[]的长度。
	 * 第二行有m个元素，为数组f[]。第三行有n个元素，为数组g[]。
	 * 
	 * 输出 输出等值数目。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int f[] = new int[m];
		int g[] = new int[n];
		for(int i = 0;i<m;i++) {
			f[i] = scan.nextInt();
		}
		for(int i = 0;i<n;i++) {
			g[i] = scan.nextInt();
		}
		System.out.println(sumEqual(f,g));
	}

	public static int sumEqual(int f[], int g[]) {
		int lenf = f.length;
		int leng = g.length;
		int indexf = 0;
		int indexg = 0;
		int sum = 0;
		while (indexf < lenf && indexg < leng) {
			if (f[indexf] == g[indexg]) {//相等的情况，计数加1，f、g都跳到下一个元素比较
				sum++;
				indexf++;
				indexg++;
			} else if (f[indexf] < g[indexg])//f小，看下一个f
				indexf++;
			else//f大，看下一个g
				indexg++;
		}
		return sum;
	}
}
