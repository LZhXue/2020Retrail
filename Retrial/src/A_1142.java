import java.util.Arrays;
import java.util.Scanner;

public class A_1142 {

	/*
	 * 题目描述 
	 * 输入三个2 进制的数，要求将这三个二进制数对应的十进制整数按从小到大的顺序输。
	 * 要求程序定义一个bToD()函数和一个main()函数，bToD() 函数的功能是将二进制数转化为十进制整数，其余功能在main()函数中实现。 int
	 * bToD(char str[]) { //函数返回二进制数str对应十进制整数 }
	 * 
	 * 输入 
	 * 输入三个2 进制的数，用空格隔开。所有数据均为非负数，二进制数长度不超过30。
	 * 
	 * 输出 
	 * 将对应的十进制整数按从小到大的顺序输出
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str[] = scan.nextLine().split(" +");
		char[] num1 = str[0].toCharArray();
		char[] num2 = str[1].toCharArray();
		char[] num3 = str[2].toCharArray();
		int arr[] = new int[3];
		arr[0] = bToD(num1);
		arr[1] = bToD(num2);
		arr[2] = bToD(num3);
		Arrays.parallelSort(arr);
		for(int i = 0;i<3;i++) {
			System.out.print(arr[i]+" ");
		}
//		System.out.println(n1+"---"+n2+"---"+n3);
	}
	public static int bToD(char str[]) {
		int sum = 0;
		int len = str.length;
		for(int i = 0;i<len;i++) {
			int temp = str[i]-48;
			sum += temp*Math.pow(2, len-i-1);
		}
		return sum;
	}
}
