import java.util.Scanner;

public class A_1223 {
	/*
	 * ��Ŀ����
	 * һ��crazy_snail���ڶ�Ӣ���飬ͻ�����룬���뿴һ���Լ������֡�snail����ÿ����ĸ�������г��ֵĴ������ܺ�ռ�����ܳ��ȵİٷֱ�
	 * ������s��,��n��,��a��,��i��,��l��,�ڸ������ַ����г��ֵĸ����ܺ�ռ�ܳ��ȵİٷֱȣ�С������ֱ����ȥ����
	 * 
	 * ���� 
	 * ��һ������һ��n��ʾ��n�����ʵ����nΪ������ ������n�У�ÿ��һ�����ʵ���� ÿ�����ʵ������һ�����Ȳ�����200���ַ��������ַ����г��ֵ��ַ���ΪСд��ĸ��
	 * 
	 * 
	 * ��� 
	 * ÿ��ʵ��������Ӧ�İٷֱȣ����ա�55%���ĸ�ʽ���������ÿ�����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
//		for(int i = 0;i<n;i++) {
//			String str = scan.nextLine();
//			String substr = "snail";
//			double sum = 0;
//			for(int j = 0;j<str.length()-4;j++) {
//				boolean flag = true;
//				if(str.charAt(j)==substr.charAt(0)) {
//					for(int k = 0;k<substr.length();k++) {
//						if(str.charAt(j+k)!=str.charAt(k)) {
//							flag = false;
//							break;
//						}
//					}
//					if(flag) {
//						sum++;
//					}
//				}
//			}
//			double rate = sum*5/str.length();
//			int result = (int) (rate*100);
//			if(str.length()<substr.length()) {
//				result = 0;
//			}
//			System.out.println(result+"%");
//		}
		for(int i = 0;i<n;i++) {
			String str = scan.nextLine();
			double sum = 0;
			for(int j = 0;j<str.length();j++) {
				if(str.charAt(j)=='s'||str.charAt(j)=='n'||str.charAt(j)=='a'||str.charAt(j)=='i'||str.charAt(j)=='l') {
					sum++;
				}
			}
			double rate = sum/str.length();
			int result = (int) (rate*100);
			System.out.println(result+"%");
		}
	}

}
