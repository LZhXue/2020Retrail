import java.util.Scanner;

public class A_1236 {
	/*
	 * ��ת���������£� 
	 * 1.һ��ĩβû��0��������������ת�����Ǹ�λ������������� 
	 * 2.һ����������ת�����Ǹ�����
	 * 3.һ��ĩβ��0��������������ת����ͬ������reverse (1200) = 2100��
	 * ����birdfly������˯����ֻ�������ڴ���������ʵ��������⣬������һ���ܰ���æ�ģ�
	 * 
	 * ���� 
	 * ���������ж��飬 ÿ�����ʵ������һ��������ռһ�С�
	 * 
	 * ��� 
	 * ��ÿ�����ʵ�������������ת����ÿ��ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String str = scan.nextLine();
			int len = str.length();
			StringBuilder sb = new StringBuilder();
			if(str.charAt(0)=='-') {
				if(str.charAt(len-1)=='0') {
					int indexZero = 0;
					for(int i = len-1;i>0;i--) {
						if(str.charAt(i)!='0') {
							indexZero = i;
							break;
						}
					}
					sb.append(str.substring(1, indexZero+1));
					sb.reverse();
					sb.append(str.substring(indexZero+1, len));
					
				}else {
					sb.append(str.substring(1, len));
					sb.reverse();
				}
				System.out.println("-"+sb.toString());
			}else {
				if(str.charAt(len-1)=='0') {
					int indexZero = 0;
					for(int i = len-1;i>0;i--) {
						if(str.charAt(i)!='0') {
							indexZero = i;
							break;
						}
					}
					sb.append(str.substring(0, indexZero+1));
					sb.reverse();
					sb.append(str.substring(indexZero+1, len));
					
				}else {
					sb.append(str);
					sb.reverse();
				}
				System.out.println(sb.toString());
			}
		}
	}

}
