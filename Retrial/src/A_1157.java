import java.util.Scanner;

public class A_1157 {
	/*
	 * ��Ŀ���� 
	 * ��������ݶ�����0��1��ɵģ����ų�����0101001110101111011��Ҫ�ҳ�����n��1���Ӵ��ж��ٸ���ȷʵ�鷳��������ʵ�ְɡ� 
	 * 
	 * ����
	 * �����һ��Ϊһ���ַ�������0��1��ɣ�����С��1000������ڶ���Ϊһ��������n�� 
	 * 
	 * ��� 
	 * ���һ����������ʾ����n����1���Ӵ��ĸ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		int n = scan.nextInt();
		System.out.println(isSub(string,n));
		
	}
	
	public static int isSub(String str,int n) {
		int lenstr = str.length();
		int sum = 0;
		for(int i = 0;i<lenstr-n+1;i++) {
			if(str.charAt(i)=='1') {
				int ss = 0;
				for(int j = 0;j<n;j++) {
					if(str.charAt(i+j)=='1') {
						ss++;
						continue;
					}else {
						break;
					}
				}
				if(ss==n) {
					sum++;
				}
			}
		}
		return sum;
	}
}
