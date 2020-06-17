import java.util.Formatter;
import java.util.Scanner;

public class YuanZhu_1011 {

	/*
	 * 题目描述 
	 * 输入圆柱体的底面半径r和高h，计算圆柱体的表面积并输出到屏幕上。
	 * 要求定义圆周率为如下宏常量 #define PI 3.14159
	 * 
	 * 输入 
	 * 输入两个实数，为圆柱体的底面半径r和高h。
	 * 
	 * 输出 
	 * 输出一个实数，即圆柱体的表面积，保留2位小数。
	 */
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double h = scan.nextDouble();
		double area = 2*PI*r*r+2*PI*r*h;
		Formatter fa = new Formatter().format("%.2f",area);
		System.out.println(fa);
	}

}
