import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A_1242 {
	/*
	 * ��Ŀ���� ���A-B������������ϵĲ���������ϵļ������㡣����Ȼ����Ҷ�֪�����ϵĶ��壬����ͬһ�������в�����������ͬ��Ԫ�أ����ﻹ�����Ѵ��һ�£�
	 * 
	 * ����
	 * ÿ����������ռ1��,ÿ�����ݵĿ�ʼ��2������n(0<=n<=100)��m(0<=m<=100),�ֱ��ʾ����A�ͼ���B��Ԫ�ظ�����Ȼ�������n+m��Ԫ�أ�
	 * ǰ��n��Ԫ�����ڼ���A����������ڼ���B. ÿ��Ԫ��Ϊ������int��Χ������,Ԫ��֮����һ���ո����. ���n=0����m=0��ʾ����Ľ�������������
	 * 
	 * ��� ���ÿ���������һ������,��ʾA-B�Ľ��,������Ϊ�ռ��ϣ��������NULL��,�����С����������,Ϊ�˼����⣬ÿ��Ԫ�غ����һ���ո�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			int nn[] = new int[n];
			int mm[] = new int[m];
			for (int i = 0; i < n; i++) {
				nn[i] = scan.nextInt();
			}
			for (int i = 0; i < m; i++) {
				mm[i] = scan.nextInt();
			}
			Arrays.parallelSort(nn);
			Arrays.parallelSort(mm);
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				boolean flag = true;
				for (int j = 0; j < m; j++) {
					if (nn[i] == mm[j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					al.add(nn[i]);
				}
			}
			if (al.size() == 0) {
				System.out.print("NULL");
			} else {
				for (int p = 0; p < al.size(); p++) {
					System.out.print(al.get(p) + " ");
				}
			}
			System.out.println();
		}
	}

}
