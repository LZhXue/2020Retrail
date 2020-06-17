import java.util.Arrays;
import java.util.Scanner;

public class A_1153 {
	/*
	 * 题目描述 
	 * 给你一组数(未排序)，请你设计一个程序：求出里面个数最多的数。并输出这个数的长度。 
	 * 例如：给你的数是：1、 2、 3、 3、 4、 4、 5、 5、 5 、6, 其中只有6组数：1, 2, 3-3, 4-4, 5-5-5 and 6. 最长的是5那组，长度为3。所以输出3。
	 * 
	 * 
	 * 输入 
	 * 第一行为整数t((1 ≤ t ≤ 10))，表示有t组测试数据。 每组测试数据包括两行，第一行为数组的长度n (1 ≤ n ≤
	 * 10000)。第二行为n个整数，所有整数Mi的范围都是(1 ≤ Mi < 2^32)
	 * 
	 * 
	 * 
	 * 输出 对应每组数据，输出个数最多的数的长度。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int max[]=new int[10];//用max数组记录每组数据中最多的数的长度
		for(int i = 0;i<t;i++) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int m = 0;m<n;m++) {
				arr[m] = scan.nextInt();
			}
			Arrays.parallelSort(arr);
			int count= 1;//对于每组数据count初始化
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]==arr[j+1])//计数
					count++;
				else
					count=1;//对于每次遇到一组中不同的数据时，初始化
				if(max[i]<count)//把出现的最多次数存入max数组
					max[i]=count;
			}
			System.out.println(max[i]);
		}
	}

}
