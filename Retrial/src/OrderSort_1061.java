import java.util.Scanner;

public class OrderSort_1061 {

	/*
	 * ��Ŀ���� 
	 * ����һ��������10��9�η������������Ӹ�λ��ʼ��λ�ָ�����λ���֡�
	 * 
	 * ���� 
	 * ����һ��������n,n��int������ 
	 * 
	 * ���
	 * ���������λ�ϵ����֣�ÿһ�����ֺ�����һ���ո����ռһ�С����磬���� 12345 ����� 1 2 3 4 5
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String  str = scan.nextLine();
		for(int i = 0;i<str.length();i++) {
			System.out.print(Integer.valueOf(str.charAt(i)-48)+" ");
		}
	}

}
