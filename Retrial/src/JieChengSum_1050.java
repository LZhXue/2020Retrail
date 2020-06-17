import java.util.Scanner;

public class JieChengSum_1050 {

	/*
	 * 求1! + 2! + ……n! 
	 * 
	 * 输入 
	 * 输入一个整数n，你可以假定n不大于10。 
	 * 
	 * 输出 
	 * 输出一个整数，即阶乘累加的结果，单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		int jie = 1;
		for(int i =1;i<n+1;i++) {
			jie = jie*i;
			sum = sum+jie;
		}
		System.out.println(sum);
	}

}
