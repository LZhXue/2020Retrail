import java.util.Scanner;

public class PingFangSumLiFangHe_1049 {

	/*
	 * 给定两个整数m和n，求出m~n这段连续的整数中所有偶数的平方和以及所有奇数的立方和。 
	 * 
	 * 输入 
	 * 由两个整数m和n组成，你可以假定m<=n. 
	 * 
	 * 输出
	 * 应包括两个整数x和y，分别表示该段连续的整数中所有偶数的平方和以及所有奇数的立方和。32位整数足以保存结果。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int ping = 0;
		int li = 0;
		for(int i = m;i<=n;i++) {
			if(i%2==0) {
				ping = ping+i*i;
			}else {
				li = li+i*i*i;
			}
		}
		System.out.println(ping+" "+li);
	}

}
