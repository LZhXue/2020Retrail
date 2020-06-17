import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class A_1201 {
	/*
	 * 题目描述 
	 * 给定含有n个元素的多重集合S，每个元素在S中出现的次数称为该元素的重数。多重集S中重数最大的元素称为众数。
	 * 例如，S={1，2，2，2，3，5}。多重集S的众数是2，其重数为3。 编程任务： 对于给定的由n 个自然数组成的多重集S，编程计算S 的众数及其重数。
	 * 
	 * 输入 
	 * 第1行多重集S中元素个数n(n<=50000)；接下来的n 行中，每行有一个自然数。 
	 * 
	 * 输出 
	 * 输出文件有2 行，第1 行给出众数，第2行是重数。(如果有多个众数，只输出最小的)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.parallelSort(arr);
		int maxchong=0;
		int record = 0;
		int chongnum=1;
		for(int i = 1;i<n;i++) {
			if(arr[i] == arr[i-1]) {
				chongnum++;
			}else {
				chongnum=1;
			}
			if(maxchong<chongnum) {
				maxchong=chongnum;
				record = arr[i];
			}
		}
		System.out.println(record);
		System.out.println(maxchong);
	}

}

