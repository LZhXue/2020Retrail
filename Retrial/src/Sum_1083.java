import java.util.Scanner;

public class Sum_1083 {

	/*
	 * 题目描述 
	 * 统计给定的n个数中，负数、零和正数的个数 
	 * 
	 * 输入
	 * 输入数据有多组，每组占一行，每行的第一个数是整数n（n<100），表示需要统计的数值的个数，然后是n个实数；如果n=0，则表示输入结束，该行不做处理。
	 * 
	 * 输出 
	 * 对于每组输入数据，输出一行a,b和c，分别表示给定的数据中负数、零和正数的个数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			if(n==0) {
				break;
			}else {
				int a = 0;
				int b = 0;
				int c = 0;
				for(int i = 0;i<n;i++) {
					double d = scan.nextDouble();
					if(d<0) {
						a++;
					}else if(d==0){
						b++;
					}else {
						c++;
					}
				}
				System.out.println(a+" "+b+" "+c);
			}
		}
	}

}
