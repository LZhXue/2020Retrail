import java.util.Scanner;

public class A_1131 {
	/*
	 * ��Ŀ���� 
	 * Ӣ����ĸ�����Ƶ����ߵ����ĸ���ĸ��? ����һ���ַ���������ַ����г��ִ���������ĸ��
	 * 
	 * ���� 
	 * ����һ��ֻ���д�Сд��ĸ�Ϳո���ַ��������Ȳ�����100���Իس�������
	 * 
	 * ��� 
	 * ���һ��Сд��ĸ����ʾ���ַ����г��ִ���������ĸ�������ж������ֻ���ASCII����С���Ǹ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		int arr[] = new int[26];//a��ASCII��97���ո���32
		for(int i = 0;i<str.length();i++) {
			int aa = str.charAt(i);
			if(aa ==' ') {
				continue;
			}else {
				arr[aa-97]++;
			}
		}
		int max = arr[0];
		int index = 0;
		for(int i = 1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		char aa = (char) (index+97);
		System.out.println(aa);
	}

}
