import java.util.Scanner;

public class A_1112 {
	/*
	 * 输入一个十进制整数n，输出对应的二进制整数。常用的转换方法为“除2取余，倒序排列”。将一个十进制数除以2，得到余数和商，将得到的商再除以2，依次类推，
	 * 直到商等于0为止，倒取除得的余数，即为所求的二进制数。
	 * 用递归的思想来描述上述计算过程是这样的：输出n/2对应的二进制数，然后输入%2。递归函数的实现过程如下：
	 * 
	 * void convert(int n)
	 * {
	 * 	if(n > 0)
	 * 	{
	 * 调用自身，输出n/2对应的二进制数;
	 * 输出n%2;
	 * }
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		convert(n);
	}
	 static void convert(int n) {
		 if(n>0) {
			 convert(n/2);
			 System.out.print(n%2);
		 }
	 }
}
