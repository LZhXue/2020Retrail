import java.util.Scanner;

public class encrypt_1064 {
	/*
	 * ��Ŀ���� 
	 * �Ӽ�������һ���ַ�����@��������Ҫ����ܲ������ 
	 * 
	 * ���� �Ӽ�������һ���ַ���ռһ�У���@������ 
	 * 
	 * ��� ���ռһ�� ���ܹ���:
	 * 1��������ĸ��ת��ΪСд��
	 * 2��������ĸ'a'��'y'����ת��Ϊ��һ����ĸ��
	 * 3������'z'����ת��Ϊ'a'�� 
	 * 4�������ַ������ֲ��䡣
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char str[] = scan.nextLine().toLowerCase().split("@")[0].toCharArray();
		for(int i = 0;i<str.length;i++) {
			if(str[i]=='z') {
				str[i] ='a';
			}else if(str[i]>='a'&&str[i]<='y') {
				str[i]++;
			}
			System.out.print(str[i]);
		}
		
		
	}

}
