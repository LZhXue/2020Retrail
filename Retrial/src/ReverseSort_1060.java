import java.util.Scanner;

public class ReverseSort_1060 {

	/*
	 * ����һ�����������������������ÿ�����ֺ���һ���ո�
	 * 
	 * ���� 
	 * ����һ��������n������Լ���n��int��Χ�� 
	 * 
	 * ���
	 * ��n�������������ÿ�����ֺ���һ���ո����ռһ�С����磬����12354�����4 5 3 2 1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(Integer.valueOf(str.charAt(i)-48)+" ");
		}
	}

}
