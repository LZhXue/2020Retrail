import java.util.Scanner;

public class Binary_1069 {

	/*
	 * ��Ŀ���� ��һ������������ת��Ϊ��Ӧ��ʮ��������
	 * 
	 * ���� ����һ�������������Իس��������ö�������Ϊ���������Ȳ�����31��
	 * 
	 * ��� ���һ��������Ϊ�ö���������Ӧ��ʮ��������
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		long sum = 0;
//		int oo = Integer.parseInt(str, 2); // ������ת��Ϊʮ����
//		int oo = Integer.parseInt(str, 8); // �˽���ת��Ϊʮ����
//		System.out.println(oo);
		//�Լ�ʵ��
		long arr[] = new long[32];
		arr[0] = 1;
		for(int i = 1;i<32;i++) {
			arr[i] = arr[i-1]*2;
		}
		//�ַ�����ת
		char[] chars = str.toCharArray();
        int end = chars.length - 1;
        int start = 0;
        while(end > start){
            char tmp = chars[end];
            chars[end] = chars[start];
            chars[start] = tmp;
            ++start;
            --end;
        }
        str = new String(chars);
        
		for(int j = str.length()-1;j>=0;j--) {
			if(str.charAt(j)=='1') {
				sum = sum+arr[j];
			}
		}
		System.out.println(sum);
				}

}
