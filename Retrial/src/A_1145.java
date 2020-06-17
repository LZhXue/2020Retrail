import java.util.Scanner;

public class A_1145 {

	/*
	 * 题目描述 某辆汽车有一个里程表，该里程表可以显示一个整数，为该车走过的公里数。然而这个里程表有个毛病：它总是从3变到5，而跳过数字4，里程表所有位（个位、
	 * 十位、百位等）上的数字都是如此。例如，如果里程表显示15339,汽车走过1公里之后，该里程表显示15350。
	 * 
	 * 输入 输入一个整数num，表示里程表显示的数值，长度不超过9位，且一定不含整数4。
	 * 
	 * 输出 输出一个整数，表示实际行驶的里程。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		int sum = 0;
//		for(int i = 1;i<=n;i++) {
//			String str = String.valueOf(i);
//			if(str.contains("4")) {
//				continue;
//			}else {
//				sum++;
//			}
//		}
//		System.out.println(sum);
		// 此方法时间超限
		// 转换为9进制,以四为界进行累加
		char nn[] = String.valueOf(n).toCharArray();
		int a = 0;
		for (int i = 0; i<nn.length; i++) {
			a *= 9;
			if (nn[i] - '0' > 4) {
				a -= 1;
			}
			a += nn[i] - '0';
		}
		System.out.println(a);
	}
}
