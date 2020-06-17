import java.util.Scanner;

public class LearnZ_1069 {
	/*
	 * Z同学为了实现暑假去云南旅游的梦想，决定以后每天只消费1元，每花k元就可以再得到1元，一开始Z同学有M元，问最多可以坚持多少天。 
	 * 
	 * 输入 
	 * 输入2个整数M,k，(2 <= k <= M <= 1000)。 
	 * 
	 * 输出 
	 * 输出一个整数，表示M元可以消费的天数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int k = scan.nextInt();
		int day = 0;
		int hua = 0;
		while(m!=0) {
			day++;
			m--;
			hua++;
			if(hua==k) {
				m++;
				hua = 0;
			}
		}
		System.out.println(day);
	}

}
