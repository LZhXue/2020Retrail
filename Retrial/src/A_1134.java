import java.util.Scanner;

public class A_1134 {
	/*
	 * ��Ŀ���� ����һ���Իس��������ַ������������ֺ���ĸ��ɣ�����˵����з������ַ���Ȼ�������ַ���ת����ʮ�������������2�����
	 * 
	 * ���� 
	 * ����һ���Իس��������ַ��������Ȳ�����100�������ֺ���ĸ��ɡ�
	 * 
	 * ��� 
	 * ��ת�������������2������������ݱ�֤�����int��Χ�ڡ�
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int len = str.length();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sb.append(ch);
			}
		}
		//�ر�ע���ַ���תֵʱ�����ַ��������쳣
		if(sb.length()==0) {
			sb.append('0');
		}
		System.out.println(2*Integer.valueOf(sb.toString()));
	}

}
