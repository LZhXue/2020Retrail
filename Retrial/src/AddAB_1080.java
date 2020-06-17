import java.util.Scanner;

public class AddAB_1080 {

	/*
	 * 计算A+B 
	 * 
	 * 输入 
	 * 输入数据有多组。 每组一行，为两个整数A, B。输入0 0表示输入结束，该组输入不用处理。 
	 * 
	 * 输出
	 * 对每行输入，输出A+B的值，单独占一行。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			if(a==0&&b==0) {
				break;
			}else {
				System.out.println(a+b);
			}
		}
	
	}

}

