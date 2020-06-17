import java.util.Arrays;
import java.util.Scanner;

public class A_1262 {
	/*
	 * ��Ŀ���� 
	 * ��һ�����ն������ϱ����򻮷ֳɹ��������ĳ����n�������ɢ�ҵطֲ��ڲ�ͬ�Ľ����С�
	 * ��x�����ʾ��������y�����ʾ�ϱ��򡣸�������λ�ÿ���������(x,y)��ʾ������������2 ��(x1,y1)��(x2,y2)֮��ľ����������ֵ|x1-x2|+|y1-y2|������
	 * ������ϣ���ڳ�����ѡ�����ʾֵ����λ�ã�ʹn������㵽�ʾֵľ����ܺ���С�� ������� ����n ��������λ��,��̼���n������㵽�ʾֵľ����ܺ͵���Сֵ�� 
	 * 
	 * ���� 
	 * ��1 ���Ǿ������n��1<10000��< ������x ���Ǿ�����λ�ã�ÿ��2> 
	 * 
	 * ���
	 * n������㵽�ʾֵľ����ܺ͵���Сֵ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arrx[] = new int[n];
		int arry[] = new int[n];
		for(int i = 0;i<n;i++) {
			arrx[i] = scan.nextInt();
			arry[i] = scan.nextInt();
		}
		Arrays.parallelSort(arrx);
		Arrays.parallelSort(arry);
		int xx = arrx[n/2];
		int yy = arry[n/2];
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum+=Math.abs(xx-arrx[i]);
			sum+=Math.abs(yy-arry[i]);
		}
		System.out.println(sum);
	}

}