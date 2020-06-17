import java.util.Arrays;
import java.util.Scanner;

public class A_1123 {

	/*
	 * 题目描述 
	 * 北京校友会每年举办两次，所有校友都有校友编号，每次到会的校友都在签到簿上写下自己的编号和姓名，在校友会成立5周年的聚会上将颁发“最佳校友奖”，
	 * 该奖项颁发给到会次数最多的校友。现在请你编写程序，找出这个奖项的得主。若有多个校友并列第一，则均可获奖。 
	 * 
	 * 输入
	 * 输入若干个整数，表示签到簿上的校友编号，所有编号均为0~99的整数，以一个负数作为输入结束的标志。 
	 * 
	 * 输出
	 * 输出出现次数最多的编号。若获奖选手有多个，则按从小到大的顺序输出选手编号，用空格隔开。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stand[] = new int[100];
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int in = scan.nextInt();
			if(in<0) {break;}
			stand[in]++;
		}
		int max = stand[0];
		for(int i = 1;i<stand.length;i++) {
			if(max<stand[i]) {
				max = stand[i];
			}
		}
		for(int i = 0;i<stand.length;i++) {
			if(max==stand[i]) {
				System.out.print(i+" ");
			}
		}
	}

}
