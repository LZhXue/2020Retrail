import java.util.Scanner;

public class A_1155 {

	/*
	 * ��Ŀ���� 
	 * �Ƚ��ַ�����С�����ȽϵĹ���ͬ�ֵ������
	 * �ַ��Ƚ��¹������£�A < a < B < b < �������� < Z < z��
	 * 
	 * ���� 
	 * �������ݰ����������ʵ����ÿ������ʵ��ռ���У�ÿһ����һ���ַ�����ֻ������Сд��ĸ�� ����С��10000����
	 * 
	 * ��� 
	 * �����һ����bb����С�ڵڶ��������YES���������NO�� ע�⣺A < a < B < b < �������� < Z < z��
	 */
	public static void main(String[] args) {
		char flag[] = new char[52];//�Աȵı�׼
		for(int i = 0;i<52;i++) {
			if(i%2==0) {
				flag[i] = (char) ('A'+i/2);
			}else {
				flag[i] = (char) ('a'+i/2);
			}
//			System.out.print(flag[i]+" ");
		}
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String str1 = scan.nextLine();
			String str2 = scan.nextLine();
			int len1 = str1.length();
			int len2 = str2.length();
			int len = Math.min(len1, len2);
			for(int i = 0;i<len;i++) {
				int index1 = search(flag,str1.charAt(i));
				int index2 = search(flag,str2.charAt(i));
				if(index1 == index2) {
					if(i!=len-1) {
						continue;
					}else {
						if(len1>=len2) {
							System.out.println("NO");
							break;
						}else {
							System.out.println("YES");
							break;
						}
					}
				}else if(index1 <index2) {
					System.out.println("YES");
					break;
				}else {
					System.out.println("NO");
					break;
				}
			}
		}
		
	}
	
	public static int search(char arr[],char ch) {
		 for(int i = 0;i<arr.length;i++) {
			 if(arr[i]==ch) {
				 return i;
			 }
		 }
		 return -1;
	 }

}
