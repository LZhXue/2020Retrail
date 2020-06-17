import java.util.Formatter;
import java.util.Scanner;

public class SummerPropt_1034 {

	/*
	 * 题目描述
	 * 商场夏季促销，购物500元以下，不打折；
	 * 购物500元（含）以上，95折；
	 * 购物1000元（含）以上，9折；
	 * 购物3000元（含）以上，85折；
	 * 购物5000元（含）以上，8折。
	 * 根据消费金额，确定用户实际需要支付的数目。 
	 * 
	 * 输入 
	 * 输入一个实数，表示消费金额。 
	 * 
	 * 输出
	 * 输出一个实数，表示用户实际需要支出的数目，保留两位小数。
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		if(x>=500&&x<1000) {
			x = x*0.95; 
		}else if(x>=1000&&x<3000) {
			x = x*0.9; 
		}else if(x>=3000&&x<5000) {
			x = x*0.85; 
		}else if(x>=5000) {
			x = x*0.8; 
		}
		Formatter fx = new Formatter().format("%.2f",x);
		System.out.println(fx);
		
	}

}
