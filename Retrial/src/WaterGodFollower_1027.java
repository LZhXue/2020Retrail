import java.util.Scanner;

public class WaterGodFollower_1027 {

	/*
	 * “水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=13+53+33。
	 * 现在要求输入一个三位数，判断该数是否是水仙花数，如果是，输出“yes”，否则输出“no” 
	 * 
	 * 输入 
	 * 输入一个三位的正整数。 
	 * 
	 * 输出 
	 * 输出“yes”或“no”。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int ge = m%10;
		int shi = m/10%10;
		int bai = m/100;
		int judge = ge*ge*ge+shi*shi*shi+bai*bai*bai;
		if(m==judge) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
