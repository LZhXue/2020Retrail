import java.util.Scanner;

public class A_1138 {
	/*
	 * ��Ŀ���� 
	 * ����һ���ַ������ж����Ƿ���C�ĺϷ���ʶ����
	 * C�����й涨��ʶ��ֻ������ĸ�����ֺ��»���3���ַ���ɣ��ҵ�һ���ַ�����Ϊ��ĸ���»��ߡ� 
	 * 
	 * ����
	 * ����һ�����Ȳ�����50���ַ����� 
	 * 
	 * ��� �������������C�ĺϷ���ʶ���������"yes"�����������no����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean first = true;
		boolean flag = true;
		if(str.charAt(0)=='_'||Character.isLetter(str.charAt(0))) {
			for(int i = 1;i<str.length();i++) {
				if(str.charAt(i)=='_'||Character.isLetter(str.charAt(i))||Character.isDigit(str.charAt(i))) {
					continue;
				}else {
					flag = false;
				}
			}
		}else {
			first = false;
		}
		if(first&&flag) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
