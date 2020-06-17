import java.util.Scanner;

public class FuHeHanShu_1098 {
//	求复合函数F(G(x))，其中函数F(x)=|x-3|+|x+1|，函数G(x)=x^2-3x。要求编写函数funF()和funG()分别求F(x)和G(x)，其余功能在main()中实现。
//			double funF(double x)
//			{
//			//函数返回F(x)的值；
//			}
//			double funG(double x)
//			{
//			//函数返回G(x)的值；
//			}
//			输入
//			输入一个实数x。
//			输出
//			输出复合函数的值，结果保留2位小数。输出占一行。

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		System.out.printf("%.2f",funF(funG(x)));

	}
	
	public static double funF(double x) {
		if(x<=-1) {
			return 2-2*x;
		}else if(x>-1&&x<=3) {
			return 4;
		}else {
			return 2*x-2;
		}
	}
	
	public static double funG(double x) {
		return x*x-3*x;
	}
}
