import java.util.Scanner;

public class Sum_1083 {

	/*
	 * ��Ŀ���� 
	 * ͳ�Ƹ�����n�����У���������������ĸ��� 
	 * 
	 * ����
	 * ���������ж��飬ÿ��ռһ�У�ÿ�еĵ�һ����������n��n<100������ʾ��Ҫͳ�Ƶ���ֵ�ĸ�����Ȼ����n��ʵ�������n=0�����ʾ������������в�������
	 * 
	 * ��� 
	 * ����ÿ���������ݣ����һ��a,b��c���ֱ��ʾ�����������и�������������ĸ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			if(n==0) {
				break;
			}else {
				int a = 0;
				int b = 0;
				int c = 0;
				for(int i = 0;i<n;i++) {
					double d = scan.nextDouble();
					if(d<0) {
						a++;
					}else if(d==0){
						b++;
					}else {
						c++;
					}
				}
				System.out.println(a+" "+b+" "+c);
			}
		}
	}

}
