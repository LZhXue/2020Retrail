import java.util.Scanner;

public class WaterGodFollower_1027 {

	/*
	 * ��ˮ�ɻ�������ָһ����λ�������ĸ�λ���ֵ������͵����䱾�����磺153=13+53+33��
	 * ����Ҫ������һ����λ�����жϸ����Ƿ���ˮ�ɻ���������ǣ������yes�������������no�� 
	 * 
	 * ���� 
	 * ����һ����λ���������� 
	 * 
	 * ��� 
	 * �����yes����no����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int ge = m%10;
		int shi = m/10%10;
		int bai = m/100;
		int judge = ge*ge*ge+shi*shi*shi+bai*bai*bai;
		if(m==judge) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
