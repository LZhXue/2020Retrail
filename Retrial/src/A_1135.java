import java.util.Scanner;

public class A_1135 {

	/*
	 * 输入
	 * 输入含有一些数据组，每组数据包括菜种（不含空格的字串），数量w（计量单位不论，一律为double型数）和单价p（double型数，表示人民币元数），因此，
	 * 每组数据的菜价就是数量乘上单价啊。菜种、数量和单价之间都有空格隔开的。 
	 * 
	 * 输出
	 * 支付菜价的时候，由于最小支付单位是角，所以总是在支付的时候采用四舍五入的方法把分头去掉。最后，请输出一个精度为角的菜价总量。
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		while(scan.hasNext()) {
			String str = scan.nextLine();
			String arr[] = str.split(" +");
			sum+=Double.valueOf(arr[1])*Double.valueOf(arr[2]);
		}
		   System.out.printf("%.1f",sum);
	       System.out.println();
	}

}

