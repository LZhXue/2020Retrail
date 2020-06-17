import java.util.Formatter;
import java.util.Scanner;

public class Salary_1032 {
	
	/*
	 * 某公司规定，销售人员工资由基本工资和销售提成两部分组成，其中基本工资是1500元/月，销售提成规则如下： 
	 * 销售额小于等于10000元时，按照5%提成；
	 * 销售额大于10000元但小于等于50000元时，超出10000部分按照3%提成； 
	 * 销售额大于50000元时，超出50000部分按照2%提成。
	 * 编写程序，根据销售额计算员工收入。
	 * 
	 * 输入
	 * 输入一个整数表示销售额
	 * 
	 * 输出
	 * 输出员工的薪水，保留2位小数。
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		double tiCheng = 0;
		if(x<=10000) {
			tiCheng = x*0.05;
		}else if(x>10000&&x<=50000){
			tiCheng = (x-10000)*0.03+500;
		}else if(x>50000) {
			tiCheng = 1700+(x-50000)*0.02;
		}
		Formatter fx = new Formatter().format("%.2f",1500+tiCheng);
		System.out.println(fx);
	}

}
