import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_1274 {
	/*
	 * ��Ŀ���� λ���ͼ�Digit-sum��һ��������Digit-sum
	 * ���ǣ�ʮ���Ʊ�ʾ�µ������ĸ���λ���ĺͣ�����1234��Digit-sum��1+2+3+4=10��3443��Digit-sum��3+4+4+3=14.
	 * ���������ǣ���������������A��B��C����A��B֮����һ������ X��ʹ��X��Digit-sum��C��
	 * Digit-sum����ӽ���������ڶ��X�������С���Ǹ���
	 * 
	 * ���� ����ĵ�һ��Ϊһ������n��������n��������ݣ� ÿ���������һ�У����� �������� A��B��C��1 <= A,B ,C
	 * <=1,000,000,000��
	 * 
	 * ��� ����ÿ�����ʵ����� �����X,ÿ��һ��
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