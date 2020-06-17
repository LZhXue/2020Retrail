import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_1235 {
	/*
	 * ��Ŀ���� 
	 * ѧУ��С����ÿ�춼�����������ʱ����Щ��ļƻ�ʱ��ᷢ����ͻ����Ҫѡ���һЩ����оٰ졣С���Ĺ������ǰ���ѧУС���õĻ��
	 * ÿ��ʱ����ల��һ���������С����һЩ��ƻ���ʱ������뾡���ܵİ��Ÿ���Ļ������������ΰ��š�
	 * 
	 * ���� 
	 * ��һ����һ��������m(m<100)��ʾ����m��������ݡ�
	 * ÿ��������ݵĵ�һ����һ������n(1<n<10000)��ʾ�ò������ݹ���n���������n�У�ÿ��������������Bi,Ei(0<=Bi,Ei<10000),
	 * �ֱ��ʾ��i�������ʼ�����ʱ�䣨Bi<=Ei)
	 * 
	 * ��� ����ÿһ�����룬�������ܹ����ŵĻ������ ÿ������ռһ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		for(int i = 0;i<m;i++) {
			int n = scan.nextInt();
			ArrayList<Activity> al = new ArrayList();
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int j = 0;j<n;j++) {
				int begin = scan.nextInt();
				if(min>begin) {
					min = begin;
				}
				int end = scan.nextInt();
				if(max<end) {
					max = end;
				}
				al.add(new Activity(begin,end));
			}
			Collections.sort(al);
			int sum = 0;
			for(int k = min-1;k<max;k++) {
				for(int h = 0;h<al.size();h++) {
					if(al.get(h).begin>k) {
						sum++;
						al.remove(h);
						break;
					}
				}
			}
			System.out.println(sum-1);
		}
	}

}

class Activity implements Comparable<Activity> {
	int begin;
	int end;
	int dur = end-begin;

	Activity(int begin, int end) {
		this.begin = begin;
		this.end = end;
	}
	
	@Override
	public int compareTo(Activity o) {
		// ������ʱ���С��������
		if (this.dur>o.dur) {
			return 1;
		} else if (this.dur<o.dur) {
			return -1;
		}
		// ������
		return 0;
	}
}
