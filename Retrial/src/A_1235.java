import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_1235 {
	/*
	 * 题目描述 
	 * 学校的小礼堂每天都会有许多活动，有时间这些活动的计划时间会发生冲突，需要选择出一些活动进行举办。小刘的工作就是安排学校小礼堂的活动，
	 * 每个时间最多安排一个活动。现在小刘有一些活动计划的时间表，他想尽可能的安排更多的活动，请问他该如何安排。
	 * 
	 * 输入 
	 * 第一行是一个整型数m(m<100)表示共有m组测试数据。
	 * 每组测试数据的第一行是一个整数n(1<n<10000)表示该测试数据共有n个活动，随后的n行，每行有两个正整数Bi,Ei(0<=Bi,Ei<10000),
	 * 分别表示第i个活动的起始与结束时间（Bi<=Ei)
	 * 
	 * 输出 对于每一组输入，输出最多能够安排的活动数量。 每组的输出占一行
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
		// 按持续时间从小到大排序
		if (this.dur>o.dur) {
			return 1;
		} else if (this.dur<o.dur) {
			return -1;
		}
		// 相等情况
		return 0;
	}
}
