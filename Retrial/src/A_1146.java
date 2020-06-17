import java.util.Arrays;
import java.util.Scanner;

public class A_1146 {
	/*
	 * Gardon吃糖果时有个特殊的癖好，就是不喜欢连续两次吃一样的糖果，喜欢先吃一颗A种类的糖果，下一次换一种口味，吃一颗B种类的糖果，这样；
	 * 可是Gardon不知道是否存在一种吃糖果的顺序使得他能把所有糖果都吃完？请你写个程序帮忙计算一下。
	 * 
	 * 输入 第一行有一个整数T，接下来T组数据，每组数据占2行，第一行是一个整数N（0 < N <=
	 * 1000000)，表示糖果的种类。第二行是N个数，表示每种糖果的数目Mi(0 < Mi <= 109)。
	 * 
	 * 输出 对于每组数据，输出一行，包含一个"Yes"或者"No"。
	 */
	/**
	 * 解题思路：
	 * 这是一道排列问题，就是将若干种类的糖果按要求排列，相同种类的糖果不能相邻。这就要考虑插孔法。先考虑数量最多的那一种糖果（假设这种糖果有n个）先间隔排好，
	 * 留出n-1个空格。剩下的糖果总数大于等于n-1，就可以使得数量最多的那一种糖果不会相邻，再将剩下的糖果按种类依次插入之前已经排好糖果的空隙中，
	 * 则可以满足题目的要求，输出yes。如果剩下的糖果总数小于n-1，数量最多的那一种糖果一定会出现相邻的状况，因此输出no。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int k = scan.nextInt();
			int arr[] = new int[k];
			for (int j = 0; j < k; j++) {
				arr[j] = scan.nextInt();
			}
			Arrays.parallelSort(arr);//升序排
			int sum = 0;
			for (int j = 0; j < k - 1; j++) {//除最大数外的总数
				sum += arr[j];
			}
			if (sum < (arr[k - 1] - 1)) {//小于空位，会相邻
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
//			scan.nextLine();
		}
	}

}
