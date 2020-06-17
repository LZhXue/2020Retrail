import java.util.Scanner;

public class HuiWenShuCaiXiang_1107 {

	/*
	 * ��Ŀ���� һ��������������������Ҷ�����֮Ϊ���������ʹ������������֮Ϊ����������һ���ģ����������ͽл�������
	 * ��ȡһ����������������ǻ������������������ĵ�������� ������Ͳ��ǻ����������ظ��������裬һֱ����û�����Ϊֹ��
	 * ��������ѧ�����һ�����룺���ۿ�ʼ��ʲô���������ھ������޴��������͵�������ӵĲ���󣬶���õ�һ����������
	 * ����Ϊֹ����֪����������ǶԻ��Ǵ���������������֤֮�����Ѿ���д��һ���������������ĺ���inverse()��
	 * ��ô����ѭ������ģ��������������֤���̣� while( m = inverse(n), m != n) { ���n; ��n����Ϊ m + n; }
	 * 
	 * ���� ����һ�����������ر�˵������������ݱ�֤�м���С��2^31��
	 * 
	 * ��� ���ռһ�У��任�Ĺ����еõ�����ֵ��������֮���ÿո������
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (true) {
			int m = inverse(n);
			if (m != n) {
				System.out.print(n + " ");
				n = m + n;
			}else {
				System.out.print(n + " ");
				break;
			}
		}
	}

	public static int inverse(int n) {
		int s = 0;
		while (n != 0) {
			s = s * 10 + n % 10;
			n = n / 10;
		}
		return (s);
	}
}
