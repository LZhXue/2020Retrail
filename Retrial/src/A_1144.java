import java.util.Scanner;

public class A_1144 {
	/*
	 * ����һ��ʮ��������n��ת����2��3��7��8������� 
	 * Ҫ�������һ��dToK()�����������ǽ�ʮ������ת��Ϊk�������������๦����main()������ʵ�֡�
	 * void dToK(int n, int k, char str[]) { //��nת��Ϊk������������str }
	 * 
	 * ���� 
	 * ����һ��int��Χ�ڵ�������n
	 * 
	 * ��� 
	 * ���Ϊ4�У��ֱ���n��Ӧ��2��3��7��8������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char str[] = null;
		dToK(n,2,str);
		dToK(n,3,str);
		dToK(n,7,str);
		dToK(n,8,str);
	}
	public static void dToK(int n, int k, char str[]) {
		StringBuilder sb = new StringBuilder();
		while(n/k!=0) {
			sb.append(n%k);
			n = n/k;
		}
		sb.append(n%k);
		sb.reverse();
		str = sb.toString().toCharArray();
		System.out.println(str);
	}
}
