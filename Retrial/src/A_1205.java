import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_1205 {

	/*
	 * 题目描述 LCY买个n束花准备送给她暗恋的女生，但是他不知道这个女生是否喜欢他。
	 * 这时候一个算命先生告诉他让他查花瓣数，第一个花瓣表示"爱"，第二个花瓣表示"不爱"，第三个花瓣表示"爱".....
	 * 为了使最后结果是"爱"，LCY需要从n束花中选出一些，你能帮他算出最后他送给这个女生的花中最多包含多少个花瓣吗？
	 * 
	 * 输入 
	 * 首先输入一个整数T，表示测试实例的个数。 接下来T组测试实例，每组实例首先输入一行，包括一个整数n(1 <= n <= 100)。
	 * 然后输入一行，n个数a1,a2...an(1 <= ai <= 100),表示每束花包含的花瓣的个数。
	 * 
	 * 输出 
	 * 每组实例输出一个整数，表示LCY最多能送多少个花瓣给这个女生。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		for(int i = 0;i<total;i++) {
			int n = scan.nextInt();
			ArrayList<Integer> alOdd = new ArrayList<Integer>();
			ArrayList<Integer> alEven = new ArrayList<Integer>();
			int sum = 0;
			for(int j = 0;j<n;j++) {
				int temp = scan.nextInt();
				if(temp%2==0) {
					alEven.add(temp);
				}else {
					alOdd.add(temp);
				}
			}
			if(alOdd.size()==0) {//没有奇数，最后和肯定是奇数
				System.out.println(0);
				continue;
			}else {//有奇数，能够组合出奇数
				for(int m = 0;m<alEven.size();m++) {//偶数的全都要
					sum+=alEven.get(m);
				}
				//奇数的要奇数个
				int lenOdd = alOdd.size();
				if(lenOdd%2==0) {//奇数有偶数个，最小的一个不要
					Collections.sort(alOdd);//升序排序
					for(int m = 1;m<lenOdd;m++) {
						sum+=alOdd.get(m);
					}
				}else {//奇数有奇数个，全都要
					for(int m = 0;m<lenOdd;m++) {
						sum+=alOdd.get(m);
					}
				}
				
			}
			System.out.println(sum);
		}
	}

}
