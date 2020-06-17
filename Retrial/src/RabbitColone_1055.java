import java.util.Scanner;

public class RabbitColone_1055 {

	/*
	 * 这是一个有趣的古典数学问题，著名意大利数学家Fibonacci曾提出一个问题：
	 * 有一对小兔子，从出生后第3个月起每个月都生一对兔子。
	 * 小兔子长到第3个月后每个月又生一对兔子。按此规律，假设没有兔子死亡，第一个月有一对刚出生的小兔子，问第n个月有多少对兔子？ 输入
	 * 
	 * 输入
	 * 月数n（1<=n<=44）。 
	 * 
	 * 输出 
	 * 输出第n个月有多少对兔子。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nn[] = new int[45];
		nn[0] = 0;
		nn[1] = 1;
		nn[2] = 1;
		for(int i = 3;i<45;i++) {
			nn[i] = nn[i-1]+nn[i-2];
		}
		System.out.println(nn[n]);
	}

}
