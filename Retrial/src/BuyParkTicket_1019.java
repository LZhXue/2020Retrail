import java.util.Scanner;

public class BuyParkTicket_1019 {
	/*
	 * 题目描述 
	 * 某公园门票的票价是每人50元，一次购票满30张，每张可以少收2元。试编写自动计费系统程序。 
	 * 
	 * 输入 
	 * 输入一个正整数，表示购票的数量。 
	 * 
	 * 输出
	 * 输出一个整数，表示用户实际需要支付的金额。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>=30) {
			System.out.println(48*n);
		}else {
			System.out.println(50*n);
		}
		
	}

}
