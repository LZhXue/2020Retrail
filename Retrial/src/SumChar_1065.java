import java.util.Scanner;

public class SumChar_1065 {

	/*
	 * ����һ���ַ����Իس�����Ϊ��������ı�־��ͳ�����������ַ��ĸ����� 
	 * 
	 * ���� 
	 * ����ַ����Իس����������س�������Ϊ��Ч�ַ��� 
	 * 
	 * ���
	 * ���һ����������ʾ�����ַ��ĸ�����
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int num = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)<='9'&&str.charAt(i)>='0') {
				num++;
			}
		}
		System.out.println(num);
	}

}
