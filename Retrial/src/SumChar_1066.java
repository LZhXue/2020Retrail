import java.util.Scanner;

public class SumChar_1066 {

	/*
	 * ����һ���ַ����Իس�����Ϊ��������ı�־��
	 * ͳ������Ӣ����ĸ�������ַ��������ַ��ĸ����� 
	 * 
	 * ����
	 * ����ַ����Իس����������س�������Ϊ��Ч�ַ�����Ч�ַ�����������100�� 
	 * 
	 * ��� 
	 * �����3�У���ʽ�����������
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		int letter = 0,digit = 0,other = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				letter++;
			}else if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				digit++;
			}else {
				other++;
			}
		}
		System.out.println("letter:"+letter);
		System.out.println("digit:"+digit);
		System.out.println("other:"+other);
	}

}
