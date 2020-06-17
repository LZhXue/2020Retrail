import java.math.BigInteger;
import java.util.Scanner;

public class DaShuMi_1090 {

	/**
	 * 题目描述 
	 * 求A^B的最后三位数表示的整数（1<=A,B<=1000） 
	 * 
	 * 输入
	 * 第一行输入一个整数n，表示有n个测试实例，接着有n行，每行一个实例，给出两个正整数A,B 
	 * 
	 * 输出 
	 * 针对每个测试实例，输出A^B的最后三位（没有前导0） ，单独占一行。
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			String stra = String.valueOf(a);
			String strb = String.valueOf(b);
			BigInteger bia = new BigInteger(stra);
			BigInteger bib = new BigInteger(strb);
			BigInteger bigMul = new BigInteger("1");
			for(int j = 0;j<b;j++) {
				bigMul = bigMul.multiply(bia);
			}
			String re = bigMul.toString();
			int len = re.length();
			if(len>3) {
				re = re.substring(len-3);
			}
			int reInt = Integer.valueOf(re);
			System.out.println(re);
			scan.nextLine();
		}

	}

}
