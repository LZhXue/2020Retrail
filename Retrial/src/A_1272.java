import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_1272 {
	/*
	 * 题目描述 为了能过个好年，xhd开始复习了，于是每天晚上背着书往教室跑。xhd复习有个习惯，在复习完一门课后，他总是挑一门更简单的课进行复习，
	 * 而他复习这门课的效率为两门课的难度差的平方,而复习第一门课的效率为100和这门课的难度差的平方。xhd这学期选了n门课，但是一晚上他最多只能复习m门课，
	 * 请问他一晚上复习的最高效率值是多少？
	 * 
	 * 输入 输入数据的第一行是一个数据T，表示有T组数据。 每组数据的第一行是两个整数n(1 <= n <= 40)，m(1 <= m <= n)。
	 * 接着有n行，每行有一个正整数a(1 <= a <= 100)，表示这门课的难度值。
	 * 
	 * 输出 对于每组输入数据，输出一个整数，表示最高效率值。
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
