import java.util.Scanner;

public class FindMax_1043 {

	/*
	 * 输入一个整数n和n个整数，输出这n个整数的最大值。
	 * 
	 * 输入 
	 * 输入有两行：第一行是一个正整数n，第二行是n个整数。
	 * 
	 * 输出 
	 * 输出包含一个整数，即n个数中的最大值，单独占一行
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n-1] ;
		int max = scan.nextInt();
		for(int i = 0;i<n-1;i++) {
			arr[i] = scan.nextInt(); 
			if(max<arr[i]) {
				
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
