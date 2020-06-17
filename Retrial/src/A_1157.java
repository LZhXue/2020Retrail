import java.util.Scanner;

public class A_1157 {
	/*
	 * 题目描述 
	 * 计算机数据都是由0和1组成的，看着长长的0101001110101111011，要找出连续n个1的子串有多少个，确实麻烦，请你编程实现吧。 
	 * 
	 * 输入
	 * 输入第一行为一个字符串，由0和1组成，长度小于1000；输入第二行为一个正整数n。 
	 * 
	 * 输出 
	 * 输出一个整数，表示连续n个的1的子串的个数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		int n = scan.nextInt();
		System.out.println(isSub(string,n));
		
	}
	
	public static int isSub(String str,int n) {
		int lenstr = str.length();
		int sum = 0;
		for(int i = 0;i<lenstr-n+1;i++) {
			if(str.charAt(i)=='1') {
				int ss = 0;
				for(int j = 0;j<n;j++) {
					if(str.charAt(i+j)=='1') {
						ss++;
						continue;
					}else {
						break;
					}
				}
				if(ss==n) {
					sum++;
				}
			}
		}
		return sum;
	}
}
