import java.util.Scanner;

public class PingFangGensum_1051 {

	/*
	 * ���еĶ������£� ���еĵ�һ��Ϊitem���Ժ����Ϊǰһ���ƽ�����������е�ǰn��ĺ͡�
	 * 
	 * ����
	 * ����������item��item<10000����n(n<1000)��ɣ�item��n�ĺ�����ǰ������ 
	 * 
	 * ���
	 * ��������еĺͣ�ռһ�У�Ҫ�󾫶ȱ���2λС����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double item = scan.nextInt();
		int n = scan.nextInt();
		double sum = 0;
		for(int i = 0;i<n;i++) {
			sum = sum+item;
			item = Math.sqrt(item);
		}
		System.out.printf("%.2f",sum);
	}

}
