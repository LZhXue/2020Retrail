import java.util.Scanner;

public class GetAverage_1097 {

	/*
	 * 题目描述
	 * 输入某位同学各门课的成绩，输出平均成绩。输入的成绩均为五级制成绩，五级制成绩转换为百分之成绩的规则如下：
	 * 'A'转换为百分之成绩为95分，'B'对应85分，C对应75分，'D'对应65分，'E'对应40分。 输出的平均成绩为一个实数，保留1位小数。
	 * getScore(char g) { //把等级g转换成对应的分数并返回这个分数。 }
	 * 
	 * 输入
	 * 输入为一行只包含'A'~'E'的字母，每个字母表示一门课的成绩，
	 * 
	 * 输出 
	 * 输出平均成绩，为一个实数，保留一位小数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int len = str.length();
		double sum = 0;
		for(int i = 0;i<len;i++) {
			sum+=getScore(str.charAt(i));
		}
		System.out.printf("%.1f",sum/len);
	}

	public static int getScore(char g) {
		if(g=='A') {
			return 95;
		}else if(g=='B') {
			return 85;
		}else if(g=='C') {
			return 75;
		}else if(g=='D') {
			return 65;
		}else {
			return 40;
		}
	}
}
