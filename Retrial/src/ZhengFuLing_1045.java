import java.util.Scanner;

public class ZhengFuLing_1045 {

	/*
	 * 统计给定的n个数中，负数、零和正数的个数。
	 * 
	 * 输入 
	 * 输入的第一个数是整数n（n<100），表示需要统计的数值的个数，然后是n个整数
	 * 
	 * 输出 
	 * 输出一行a,b和c，分别表示给定的数据中负数、零和正数的个数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a=0,b=0,c=0;
		for(int i = 0;i<n;i++) {
			int x = scan.nextInt();
			if(x<0) {
				a++;
			}else if(x==0) {
				b++;
			}else {
				c++;
			}
		}
		System.out.println(a+" "+b+" "+c);
	}

}
