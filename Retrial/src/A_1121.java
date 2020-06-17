import java.util.Scanner;

public class A_1121 {
	/*
	 * 题目描述 
	 * 在某一高层建筑内只有一部电梯，当你按下一个数时，电梯会运行到那一层。
	 * 已知电梯每上升一层需6秒，下降一层需4秒，在需要停留的那层停留5秒。
	 * 现有N个整数组成的一个需求列表，电梯将依次响应，电梯从0层开始运行，而在运行过程结束之前不会返回0层。
	 * 注意，若出现相邻两个整数相等，代表在同一层执行了两个不同任务，可以理解为：电梯已经停了5秒，正要关门时又有人在同一层按开门键，电梯又开门并停留5秒。 
	 * 
	 * 输入
	 * 输入分两行，第一行是一个正整数N（N<=1000)，代表停留几次，第二行的N个数字代表这几次依次停留的楼层。 
	 * 
	 * 输出
	 * 输出电梯完成该任务序列所需的时间，单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		sum = sum+arr[0]*6+5;
		for(int i = 1;i<n;i++) {
			int temp = (arr[i]-arr[i-1]);
			if(temp>0) {
				sum = sum+temp*6+5;
			}else {
				sum = sum+(-1*temp*4)+5;
			}
		}
		System.out.println(sum);
	}

}
