import java.util.Scanner;

public class sumVowel_1093 {
	/**
	 * ����һ���ַ�����ͳ������Ԫ����ĸ�ĸ�����Ҫ��ʹ�ú���vowel()�����ж��Ƿ�ΪԪ��,���๦����main()������ʵ�֡�
	 *  int vowel(char ch) { //���ch��Ԫ��������1�����򷵻�0 }
	 *  ����һ���ַ��������Ȳ�����1000���Իس���������
	 *  ���һ����������ʾԪ����ĸ�������������ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();//˫���������ASCII�ַ����ֻ���� 65534 ��
		int len = str.length();
		int sum = 0;
		for(int i = 0;i<len;i++) {
			if(vowel(str.charAt(i))==1) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
	public static int vowel (char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return 1;
		}
		return 0;
	}

}
