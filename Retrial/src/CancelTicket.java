import java.util.Scanner;

public class CancelTicket {

	/*
	 * Ʊ��˳�վ����ʱ��ǰ48Сʱ���ϵİ�Ʊ��5%����Ʊ�ѡ�
	 * ͬʱ����Ʊ��Ʊ�ѵļ��㷽�������������뵽ԪΪ��λ��������5��Ϊ��λ��β��С��0.25Ԫ����ȥ��
	 * ��С��0.25Ԫ��С��0.75Ԫ�ļ�Ϊ0.5Ԫ����С��0.75Ԫ�Ľ�Ϊ1Ԫ����дһ��������������Ʊ�ѣ��ٶ���Ʊʱ���������ʱ����48Сʱ���ϡ�
	 * ����ԭ�����£� double CancelFee(double price); ���� ����һ��ʵ������ʾ��ƱƱ��۸� ���
	 * ���һ��ʵ������ʾ��Ʊ�ѣ��������һλС����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double cost = scan.nextDouble();
		System.out.printf("%.1f",CancelFee(cost));
	}
	public static double CancelFee(double price) {
		double cost = price*0.05;
		double zh = Math.floor(cost);
		double rear = cost- zh;
		if(rear<0.25) {
			return zh;
		}else if(rear<0.75&&rear>=0.25) {
			return 0.5+zh;
		}else {
			return 1+zh;
		}
	}
}
