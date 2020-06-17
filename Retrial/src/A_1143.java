import java.util.Arrays;
import java.util.Scanner;

public class A_1143 {
	/*
	 * 输入n个数，每个数的进制由其后面的数字k指定，k>=2且k<=10， 输出最大的数对应的十进制数。
	 * 要求程序定义一个KToD()函数和一个main()函数，KToD() 函数的功能是将k进制数转化为十进制整数，其余功能在main()函数中实现。 
	 * int KToD(char str[], int k) { //函数返回k进制数str对应十进制整数 } 
	 * 
	 * 输入
	 * 首先输入整数n，然后是n行，每行包含一个字符串和一个整数k，用空格隔开,该字符串表示一个k进制数。所有输入均为非负数。 
	 * 
	 * 输出 
	 * 输出最大的数对应的十进制数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String line[] = scan.nextLine().split(" +");
			char str[] = line[0].toCharArray();
			int k = Integer.valueOf(line[1]);
			arr[i] = KToD(str,k);
		}
		Arrays.parallelSort(arr);
		System.out.println(arr[n-1]);
	}
	public static int KToD(char str[], int k) {
		int sum = 0;
		int len = str.length;
		for(int i = 0;i<len;i++) {
			int temp = str[i]-48;
			sum += temp*Math.pow(k, len-i-1);
		}
		return sum;
	}
}
