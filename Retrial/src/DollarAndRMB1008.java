import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class DollarAndRMB1008 {

	/*
	 * 题目描述
	 * 假设美元与人民币的汇率是1美元兑换6.5573元人民币，
	 * 编写程序输入美元的金额，输出能兑换的人民币金额。
	 * 
	 * 输入
	 * 输入美元的金额。
	 * 
	 * 输出
	 * 输出能兑换的人民币的数值。输出保留2位小数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double m = scan.nextDouble()*6.5573;
//		DecimalFormat df = new DecimalFormat(".00");
//		System.out.println(df.format(m));//注意，这样返回的是一个字符串类型
		Formatter fm = new Formatter().format("%.2f", m);//这样返回的才是一个double类型的
		System.out.print(fm);
	}

}
