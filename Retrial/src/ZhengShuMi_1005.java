import java.util.Scanner;

public class ZhengShuMi_1005 {

	/*
	 * 输入3个整数，输出它们的1次幂、2次幂和3次幂。 输入3整数，用空格隔开。
	 * 输出3行，每行3个整数，分别是它们的1次幂、2次幂和3次幂，每个整数占9列，不足9列左对齐。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,z;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		scan.close();
		System.out.printf("%-9d%-9d%-9d\n",x,x*x,x*x*x);//每个整数占9列，不足9列左对齐
		System.out.printf("%-9d%-9d%-9d\n",y,y*y,y*y*y);
		System.out.printf("%-9d%-9d%-9d\n",z,z*z,z*z*z);
	}

}
