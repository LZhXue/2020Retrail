import java.util.Arrays;
import java.util.Scanner;

public class A_1124 {
	/*
	 * ��Ŀ���� ��֪����a����m�������������е�Ԫ�أ�����b����n���������е�Ԫ�أ���̽�a��b�е�����Ԫ�ذ������������c�С�
	 * 
	 * ���� ���������У���һ��������һ��������m��Ȼ����m�������� �ڶ���������һ��������n��Ȼ����n��������m, n��С�ڵ���1000000��
	 * 
	 * 
	 * ��� ����ϲ����m+n������������֮���ÿո���������ռһ�С�
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

		// ����������
		Arrays.sort(crr);

		// �����ӡ����Ԫ��
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
