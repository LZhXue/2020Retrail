import java.util.Scanner;

public class JieChengSum_1050 {

	/*
	 * ��1! + 2! + ����n! 
	 * 
	 * ���� 
	 * ����һ������n������Լٶ�n������10�� 
	 * 
	 * ��� 
	 * ���һ�����������׳��ۼӵĽ��������ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		int jie = 1;
		for(int i =1;i<n+1;i++) {
			jie = jie*i;
			sum = sum+jie;
		}
		System.out.println(sum);
	}

}
