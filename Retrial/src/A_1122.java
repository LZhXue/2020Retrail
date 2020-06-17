import java.util.Arrays;
import java.util.Scanner;

public class A_1122 {
	/*
	 * 题目描述 小明的老师布置了一份调查作业，小明想在学校中随机找N个同学一起做一项问卷调查，聪明的小明为了实验的客观性，
	 * 他先随机写下了N个1到1000之间的整数（0<N≤1000），不同的数对应着不同的学生的学号。但他写下的数字难免会有重复数字，
	 * 小明希望能把其余重复的数去掉，然后再把这些数从小到大排序， 按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
	 * 
	 * 输入 输入有2行，第1行为1个正整数，表示整数的个数N. 第2行有N个用空格隔开的正整数，表示小明写下的N个整数。
	 * 
	 * 输出 输出也是2行，第1行为1个正整数M，表示不相同的整数的个数。第2行为M个用空格隔开的正整数，为从小到大排好序的不相同的整数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.parallelSort(arr);
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] - arr[i - 1] == 0) {
				arr[i-1] = 0;
				sum++;
			}
		}
		System.out.println(n - sum);
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				System.out.print(arr[i] + " ");
			}
			
		}

	}

}
