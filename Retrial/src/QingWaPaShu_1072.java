import java.util.Scanner;

public class QingWaPaShu_1072 {

	/*
	 * 题目描述 
	 * 有一口深度为high米的水井，井底有一只青蛙，它每天白天能够沿井壁向上爬up米，夜里则顺井壁向下滑down米，
	 * 若青蛙从某个早晨开始向外爬，对于任意指定的high、up和down值（均为自然数），计算青蛙多少天能够爬出井口？ 
	 * 
	 * 输入 
	 * 输入3个正整数：high、up和down。 
	 * 
	 * 输出
	 * 输出一个整数，表示天数。输出单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		int up = scan.nextInt();
		int down = scan.nextInt();
		int i = 0;
		int day = 0;
		while(high!=0) {
			if(i%2==0) {
				high = high-up;
				day++;
			}else {
				high = high+down;
			}
			i++;
		}
		System.out.println(day);
	}

}
