import java.util.Scanner;

public class A_1236 {
	/*
	 * 逆转数定义如下： 
	 * 1.一个末尾没有0的整数，它的逆转数就是各位数字逆序输出； 
	 * 2.一个负数的逆转数仍是负数；
	 * 3.一个末尾有0的整数，它的逆转数如同下例：reverse (1200) = 2100。
	 * 看着birdfly难以入睡，我只好求助于聪明的你编程实现这个问题，相信你一定能帮上忙的！
	 * 
	 * 输入 
	 * 输入数组有多组， 每组测试实例包含一个大数且占一行。
	 * 
	 * 输出 
	 * 对每组测试实例，输出它的逆转数。每组占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String str = scan.nextLine();
			int len = str.length();
			StringBuilder sb = new StringBuilder();
			if(str.charAt(0)=='-') {
				if(str.charAt(len-1)=='0') {
					int indexZero = 0;
					for(int i = len-1;i>0;i--) {
						if(str.charAt(i)!='0') {
							indexZero = i;
							break;
						}
					}
					sb.append(str.substring(1, indexZero+1));
					sb.reverse();
					sb.append(str.substring(indexZero+1, len));
					
				}else {
					sb.append(str.substring(1, len));
					sb.reverse();
				}
				System.out.println("-"+sb.toString());
			}else {
				if(str.charAt(len-1)=='0') {
					int indexZero = 0;
					for(int i = len-1;i>0;i--) {
						if(str.charAt(i)!='0') {
							indexZero = i;
							break;
						}
					}
					sb.append(str.substring(0, indexZero+1));
					sb.reverse();
					sb.append(str.substring(indexZero+1, len));
					
				}else {
					sb.append(str);
					sb.reverse();
				}
				System.out.println(sb.toString());
			}
		}
	}

}
