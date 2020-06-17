import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_1272 {
	/*
	 * ��Ŀ���� Ϊ���ܹ������꣬xhd��ʼ��ϰ�ˣ�����ÿ�����ϱ������������ܡ�xhd��ϰ�и�ϰ�ߣ��ڸ�ϰ��һ�ſκ���������һ�Ÿ��򵥵Ŀν��и�ϰ��
	 * ������ϰ���ſε�Ч��Ϊ���ſε��ѶȲ��ƽ��,����ϰ��һ�ſε�Ч��Ϊ100�����ſε��ѶȲ��ƽ����xhd��ѧ��ѡ��n�ſΣ�����һ���������ֻ�ܸ�ϰm�ſΣ�
	 * ������һ���ϸ�ϰ�����Ч��ֵ�Ƕ��٣�
	 * 
	 * ���� �������ݵĵ�һ����һ������T����ʾ��T�����ݡ� ÿ�����ݵĵ�һ������������n(1 <= n <= 40)��m(1 <= m <= n)��
	 * ������n�У�ÿ����һ��������a(1 <= a <= 100)����ʾ���ſε��Ѷ�ֵ��
	 * 
	 * ��� ����ÿ���������ݣ����һ����������ʾ���Ч��ֵ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int tt = scan.nextInt();
		for (int t = 0; t < tt; t++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				al.add(scan.nextInt());
			}
			int sum = 0;
			int temp = 100;
			int maxindex = findMax(temp, al);
			int max = Math.abs(temp - al.get(maxindex));
			sum += max * max;
			System.out.println(sum);
		}
	}

	public static int findMax(int x, ArrayList<Integer> al) {
		int max = -1;
		int index = -1;
		for (int i = 0; i < al.size(); i++) {
			int temp = x - al.get(i);
			if (max < temp) {
				max = temp;
				index = i;
			}
		}
		return index;
	}
}
