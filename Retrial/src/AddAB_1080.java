import java.util.Scanner;

public class AddAB_1080 {

	/*
	 * ����A+B 
	 * 
	 * ���� 
	 * ���������ж��顣 ÿ��һ�У�Ϊ��������A, B������0 0��ʾ����������������벻�ô��� 
	 * 
	 * ���
	 * ��ÿ�����룬���A+B��ֵ������ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			if(a==0&&b==0) {
				break;
			}else {
				System.out.println(a+b);
			}
		}
	
	}

}

