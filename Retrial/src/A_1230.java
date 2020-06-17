import java.util.Scanner;

public class A_1230 {
	/*
	 * 题目描述 径直经过一片麦田，不能回头，选出你认为最大的麦穗，但是当你选择一个麦穗后，就不能选第二次。 现在 surfacedust
	 * 准备经历一次亚里士多德老师很久以前给出的难题，surfacedust有一个标准来评判这个麦穗是不是足够好。如果一个麦穗达到这个标准分，
	 * 就认为这是他要选择的那个。
	 * 
	 * 输入 每组实例三行，第一行是surfacedust的标准分，第二行为一个整数N（N < 100000），第三行是N个整数，依次表示了每个麦穗的分数。
	 * 
	 * 输出 surfacedust需要走多久才能找到他心中的那个麦穗，如果他找不到，那就输出“NONE”，详见样例。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double standard = scan.nextDouble();
			int n = scan.nextInt();
			double arr[] = new double[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextDouble();
			}
			for (int i = 0; i < n; i++) {
				if (arr[i] >= standard) {
						sum = i + 1;
						break;
				}
			}
			if (arr[n - 1] < standard && sum == 0) {
				System.out.println("NONE");
			} else {
				System.out.println(sum);
			}
		}
	}

}
