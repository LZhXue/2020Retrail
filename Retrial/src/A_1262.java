import java.util.Arrays;
import java.util.Scanner;

public class A_1262 {
	/*
	 * 题目描述 
	 * 在一个按照东西和南北方向划分成规整街区的城市里，n个居民点散乱地分布在不同的街区中。
	 * 用x坐标表示东西向，用y坐标表示南北向。各居民点的位置可以由坐标(x,y)表示。街区中任意2 点(x1,y1)和(x2,y2)之间的距离可以用数值|x1-x2|+|y1-y2|度量。
	 * 居民们希望在城市中选择建立邮局的最佳位置，使n个居民点到邮局的距离总和最小。 编程任务： 给定n 个居民点的位置,编程计算n个居民点到邮局的距离总和的最小值。 
	 * 
	 * 输入 
	 * 第1 行是居民点数n，1<10000。< 个整数x 行是居民点的位置，每行2> 
	 * 
	 * 输出
	 * n个居民点到邮局的距离总和的最小值。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arrx[] = new int[n];
		int arry[] = new int[n];
		for(int i = 0;i<n;i++) {
			arrx[i] = scan.nextInt();
			arry[i] = scan.nextInt();
		}
		Arrays.parallelSort(arrx);
		Arrays.parallelSort(arry);
		int xx = arrx[n/2];
		int yy = arry[n/2];
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum+=Math.abs(xx-arrx[i]);
			sum+=Math.abs(yy-arry[i]);
		}
		System.out.println(sum);
	}

}