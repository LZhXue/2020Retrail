import java.util.Scanner;

public class JudgeChar_1026 {
	/*
	 * �Ӽ�������һ���ַ����жϸ��ַ��Ƿ��д��ĸ��Сд��ĸ�������ַ��������ַ����ֱ������Ӧ����ʾ��Ϣ�� 
	 * 
	 * ���� 
	 * ����һ���ַ��� 
	 * 
	 * ���
	 * ������ַ��Ǵ�д��ĸ���������upper��������Сд��ĸ���������lower�������������ַ����������digit�������������ַ����������other������
	 * �������˫���ţ���
	 */	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 String wait = scan.nextLine();
		 char ch = wait.charAt(0);
		 if(ch<='z'&&ch>='a') {
			 System.out.println("lower");
		 }else if(ch<='Z'&&ch>='A') {
			 System.out.println("upper");
		 }else if(ch<='9'&&ch>='0') {
			 System.out.println("digit");
		 }else {
			 System.out.println("other");
		 }
	}

}
