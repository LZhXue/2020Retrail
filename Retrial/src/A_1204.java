import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_1204 {
	/*
	 * 题目描述 一个数与另一个数如果含有相同数字和个数的字符，则称两数相关。现有一堆乱七八糟的整数，里面可能充满了彼此相关的数，请你用一下手段，自动地将其剔除。
	 * 
	 * 输入 多实例测试。每组数据包含一个n(n<1000)，和n个int范围内的正整数。 若n为0，表示结束。
	 * 
	 * 输出 按从小到大的顺序输出非相关数，若没有非相关数，则输出None。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			ArrayList<Integer> arrl = new ArrayList<Integer>();// 存放非相关数
			int input[] = new int[n];// 该组所有的输入
			for (int i = 0; i < n; i++) {
				input[i] = scan.nextInt();
			}
			for (int i = 0; i < n; i++) {
				char chArrI[] = String.valueOf(input[i]).toCharArray();// input[i]转为字符数组，然后排序，最后再转为数组
				Arrays.parallelSort(chArrI);
				String stri = String.valueOf(chArrI);
				boolean flag = true;
				for (int j = 0; j < n; j++) {
					if (i != j) {
						char chArrJ[] = String.valueOf(input[j]).toCharArray();
						Arrays.parallelSort(chArrJ);
						String strj = String.valueOf(chArrJ);
						if (stri.equals(strj)) {
							flag = false;
							break;//找到第一个相关数，后面的不必再寻找
						}
					}
				} // end-j
				if (flag) {//j循环完了也没有找到相关数，说明没有，加到ArrayList中
					arrl.add(input[i]);

				}
			} // end-i
			Collections.sort(arrl);// 针对一个ArrayList内部的数据排序
			if (arrl.size() == 0) {
				System.out.println("None");
				n = scan.nextInt();//不要忘记下一次输入
				continue;
			}
			for (int m = 0; m < arrl.size(); m++) {
				System.out.print(arrl.get(m) + " ");
			}
			System.out.println();
			n = scan.nextInt();
		} // end-while
	}
}
