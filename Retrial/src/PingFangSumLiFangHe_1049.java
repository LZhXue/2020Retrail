import java.util.Scanner;

public class PingFangSumLiFangHe_1049 {

	/*
	 * ������������m��n�����m~n�������������������ż����ƽ�����Լ����������������͡� 
	 * 
	 * ���� 
	 * ����������m��n��ɣ�����Լٶ�m<=n. 
	 * 
	 * ���
	 * Ӧ������������x��y���ֱ��ʾ�ö�����������������ż����ƽ�����Լ����������������͡�32λ�������Ա�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int ping = 0;
		int li = 0;
		for(int i = m;i<=n;i++) {
			if(i%2==0) {
				ping = ping+i*i;
			}else {
				li = li+i*i*i;
			}
		}
		System.out.println(ping+" "+li);
	}

}
