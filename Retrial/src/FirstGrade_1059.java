import java.util.Scanner;

public class FirstGrade_1059 {

	/*
	 * ����һ��ѧ���ĳɼ����������������߷֡� 
	 * 
	 * ���� 
	 * �����������Ǹ�������һ�����������ø�������Ϊ��Ч�ɼ���ֻ��ʾ���������
	 * 
	 * ���
	 * һ������������߷֡�����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		int m = 0;
		while(scan.hasNext()) {
			m = scan.nextInt();
			if(m<0) {break;}
			if(max<m) {
				max = m;
			}
		}
		System.out.println(max);
	}

}
