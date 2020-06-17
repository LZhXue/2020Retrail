import java.util.Scanner;

public class FirstGrade_1059 {

	/*
	 * 输入一批学生的成绩（整数），输出最高分。 
	 * 
	 * 输入 
	 * 输入包含多个非负整数和一个负整数。该负数不作为有效成绩，只表示输入结束。
	 * 
	 * 输出
	 * 一个整数，即最高分。单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		int m = 0;
		while(scan.hasNext()) {
			m = scan.nextInt();
			if(m<0) {break;}
			if(max<m) {
				max = m;
			}
		}
		System.out.println(max);
	}

}
