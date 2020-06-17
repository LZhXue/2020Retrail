import java.util.Formatter;
import java.util.Scanner;

public class triangleArea_1014 {
	/*
	 * 题目描述 
	 * 给出三角形的三条边，求三角形的面积。
	 * 
	 * 输入 
	 * 输入三角形的三条边长（实数），数据之间用空格隔开。
	 * 
	 * 输出 
	 * 输出三角形的面积，结果保留2位小数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		double p = (x+y+z)/2;
		double area = Math.sqrt(p*(p-x)*(p-y)*(p-z));
		Formatter fa = new Formatter().format("%.2f",area);
		System.out.println(fa);
		
	}

}
