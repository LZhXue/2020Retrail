import java.util.Scanner;

public class A_1239 {
	/*
	 * ��Ŀ����
	 * ���һ���ַ�������k����ͬ���ַ������������,������ַ����ͽ���K-String.����:�ַ���aabaabaabaab����1-String,����2-
	 * String,Ҳ��4-String������Ȼ,�����κ�һ���ַ�����˵,������ 1-String.
	 * ���ڸ�һ���ַ���S(������СдӢ����ĸ)��һ������K,�����������������S,ʹ�����һ��K-String.
	 * 
	 * ���� 
	 * �������N�����ʵ��,ÿ��ʵ��ռ����,��һ����һ������K(1 <= K <= 1000).�ڶ������ַ���S.S�ĳ�����1-1000֮��.
	 * 
	 * ��� 
	 * ÿ��ʵ�����ռһ��,�ж��ַ���Sͨ����������֮���ܷ���һ��K-String,����������Yes,�������No.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0;i<n;i++) {
			int k = scan.nextInt();
			scan.nextLine();
			String str = scan.nextLine();
			int standard[] = new int[26];
			for(int j = 0;j<str.length();j++) {
				int temp = str.charAt(j)-97;
				standard[temp]++;

			}
			boolean flag = true;
			for(int m = 0;m<26;m++) {
				if(standard[m]%k!=0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
