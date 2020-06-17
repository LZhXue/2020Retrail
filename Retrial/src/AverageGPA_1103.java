import java.util.Scanner;

public class AverageGPA_1103 {

	/*
	 * 课程绩点的计算方法通常是：（百分制成绩-50)/10取整。成绩100，对应绩点为5，成绩90~99对应绩点为4，......，成绩60~69对应绩点为1，成绩小于60，对应绩点为0。
	 * 平均学分绩点的计算方法是：是将学生修过的每一门课程的绩点乘以该门课程的学分，累加后再除以总学分。编程计算一个学生的平均学分绩点。 
	 * 
	 * 输入
	 * 输入n表示有n门课程，然后输入n门课程的学分和成绩，学分和成绩都是整数。 
	 * 
	 * 输出 
	 * 输出平均学分绩点，保留一位小数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		double sumG = 0;
		double sumK = 0;
		for(int i = 0;i<n;i++) {
			int num = scan.nextInt();
			int grade = scan.nextInt();
			sumG = sumG+num*GPA(grade);
			sumK = sumK+num;
		}
		System.out.printf("%.1f",sumG/sumK);
	}
	public static double GPA(int grade) {
		double re;
		if(grade==100) {
			re = 5;
		}else if(grade>=90&&grade<=99) {
			re = 4;
		}else if(grade>=80&&grade<=89) {
			re = 3;
		}else if(grade>=70&&grade<=79) {
			re = 2;
		}else if(grade>=60&&grade<=69) {
			re = 1;
		}else {
			re = 0;
		}
		return re;
	}
}
