import java.util.Scanner;

public class MaxGongYueShu_1062 {

	/*
	 * ��Ŀ���� ��������������10��9�η�������������������Լ����
	 * 
	 * ���� ��������������m��n������֮���ÿո������
	 * 
	 * ��� ���һ����������ʾm��n�����Լ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int result;
//		for (int i = Math.min(m, n); i > 0; i--) {
//			if (m % i == 0 && n % i == 0) {
//				System.out.println(i);
//				break;
//			}
//		}    //�˷���ʱ�䳬�ޣ�����շת�����ʵ��
//		ʹ��շת�����������ŷ������㷨��Euclidean algorithm�����������Լ����һ�ַ�����
//		���ľ��������ǣ��ýϴ������Խ�С�������ó��ֵ���������һ������ȥ�����������ó��ֵ��������ڶ�������ȥ����һ��������˷�����ֱ�����������0Ϊֹ��������������������Լ������ô���ĳ��������������������Լ����

		if (m >= n) {// շת�����
			while (m % n != 0) {
				int c = m % n;
				m = n;
				n = c;
			}
			result = n;
		} else {
			while (n % m != 0) {
				int c = n % m;
				n = m;
				m = c;
			}
			result = m;
		}
		System.out.println(result);
	}
}