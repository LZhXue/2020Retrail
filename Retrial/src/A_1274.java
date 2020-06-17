import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_1274 {
	/*
	 * 题目描述 位数和即Digit-sum。一个整数的Digit-sum
	 * 就是：十进制表示下的整数的各个位数的和，例如1234的Digit-sum是1+2+3+4=10，3443的Digit-sum是3+4+4+3=14.
	 * 现在问题是：给你三个正整数A，B和C，在A和B之间找一个整数 X，使得X的Digit-sum与C的
	 * Digit-sum的最接近，如果存在多个X则输出最小的那个。
	 * 
	 * 输入 输入的第一行为一个整数n，表明有n组测试数据； 每组测试数据一行，包含 三个整数 A，B，C（1 <= A,B ,C
	 * <=1,000,000,000）
	 * 
	 * 输出 对于每组测试实例输出 所求的X,每组一行
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			ArrayList<Point> al = new ArrayList<Point>();
			for (int j = a; j <= b; j++) {
				al.add(new Point(j, c));
			}
			Collections.sort(al);
			System.out.println(al.get(0).x);
		}
	}

}

class Point implements Comparable<Point> {
	int x;
	int sum;

	Point(int x, int y) {
		this.x = x;
		int tempsum = getDigitSum(x);

//		int tempsum = 0;
//		while(x%10!=0) {
//			tempsum += x%10;
//			x = x/10;
//		}
//		tempsum += x;

		int ySum = this.getDigitSum(y);

		this.sum = Math.abs(tempsum - ySum);
	}

	public int getDigitSum(int n) {

		
		int tempsum = 0;
		while (n / 10 != 0) {
			tempsum = tempsum + n % 10;
			n = n / 10;
		}
		tempsum = tempsum + n;
		
		return tempsum;

	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", sum=" + sum + "]";
	}

	@Override
	public int compareTo(Point o) {
		if(this.sum<o.sum)
		{
			return -1;
			
		}else if(this.sum>o.sum)
		{
			return 1;
		}
		else {
			return 0;
		}
		
//		if (this.sum > o.sum) {
//			return -1;
//		} else if (this.sum < o.sum) {
//			return 1;
//		} else {
//			if (this.x > o.x) {
//				return 1;
//			} else if (this.x < o.x) {
//				return -1;
//			} else {
//				return 0;
//			}
//		}
	}
}