import java.util.Scanner;

public class BuyParkTicket_1019 {
	/*
	 * ��Ŀ���� 
	 * ĳ��԰��Ʊ��Ʊ����ÿ��50Ԫ��һ�ι�Ʊ��30�ţ�ÿ�ſ�������2Ԫ���Ա�д�Զ��Ʒ�ϵͳ���� 
	 * 
	 * ���� 
	 * ����һ������������ʾ��Ʊ�������� 
	 * 
	 * ���
	 * ���һ����������ʾ�û�ʵ����Ҫ֧���Ľ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>=30) {
			System.out.println(48*n);
		}else {
			System.out.println(50*n);
		}
		
	}

}
