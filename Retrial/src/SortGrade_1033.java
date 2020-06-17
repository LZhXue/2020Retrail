import java.util.Scanner;

public class SortGrade_1033 {

	/*
	 * 给定一个百分制成绩, 请根据百分制成绩输出其对应的等级。
	 * 转换关系如下： 90分及以上为’A’，80~89为’B’， 70~79为’C’，60~69为’D’，60分以下为’E’。 
	 * 
	 * 输入 
	 * 一个百分制成绩（0~100的整数)。 
	 * 
	 * 输出 
	 * 输出对应的等级。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		if(grade>=90) {
			System.out.println("A");
		}else if(grade>=80&&grade<=89) {
			System.out.println("B");
		}else if(grade>=70&&grade<=79) {
			System.out.println("C");
		}else if(grade>=60&&grade<=69) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	}

}
