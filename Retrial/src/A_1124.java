import java.util.Arrays;
import java.util.Scanner;

public class A_1124 {
	/*
	 * 题目描述 已知数组a中有m个按升序序排列的元素，数组b中有n个降序排列的元素，编程将a与b中的所有元素按降序存入数组c中。
	 * 
	 * 输入 输入有两行，第一行首先是一个正整数m，然后是m个整数； 第二行首先是一个正整数n，然后是n个整数，m, n均小于等于1000000。
	 * 
	 * 
	 * 输出 输出合并后的m+n个整数，数据之间用空格隔开。输出占一行。
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int num = input.nextInt();
			arr[i] = num;
		}

		int m = input.nextInt();
		int[] brr = new int[m];

		for (int i = 0; i < m; i++) {
			int num = input.nextInt();
			brr[i] = num;
		}

		int[] crr = merge(arr, brr);

		// 对数组升序
		Arrays.sort(crr);

		// 倒序打印数组元素
		for (int i = crr.length - 1; i >= 0; i--) {
			System.out.print(crr[i] + " ");
		}

	}

	public static int[] merge(int[] a, int[] b) {
		int pa = 0;
		int pb = 0;
		int pc = 0;
		int m = a.length;
		int n = b.length;
		int[] c = new int[m + n];
		while (pa < m && pb < n) {
			if (a[pa] < b[pb]) {
				c[pc++] = a[pa++];
			} else {
				c[pc++] = b[pb++];
			}
		}
		if (pa < m)
			while (pa < m)
				c[pc++] = a[pa++];
		else
			while (pb < n)
				c[pc++] = b[pb++];
		return c;
	}

}
