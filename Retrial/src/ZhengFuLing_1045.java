import java.util.Scanner;

public class ZhengFuLing_1045 {

	/*
	 * ͳ�Ƹ�����n�����У���������������ĸ�����
	 * 
	 * ���� 
	 * ����ĵ�һ����������n��n<100������ʾ��Ҫͳ�Ƶ���ֵ�ĸ�����Ȼ����n������
	 * 
	 * ��� 
	 * ���һ��a,b��c���ֱ��ʾ�����������и�������������ĸ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a=0,b=0,c=0;
		for(int i = 0;i<n;i++) {
			int x = scan.nextInt();
			if(x<0) {
				a++;
			}else if(x==0) {
				b++;
			}else {
				c++;
			}
		}
		System.out.println(a+" "+b+" "+c);
	}

}
