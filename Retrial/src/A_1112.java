import java.util.Scanner;

public class A_1112 {
	/*
	 * ����һ��ʮ��������n�������Ӧ�Ķ��������������õ�ת������Ϊ����2ȡ�࣬�������С�����һ��ʮ����������2���õ��������̣����õ������ٳ���2���������ƣ�
	 * ֱ���̵���0Ϊֹ����ȡ���õ���������Ϊ����Ķ���������
	 * �õݹ��˼��������������������������ģ����n/2��Ӧ�Ķ���������Ȼ������%2���ݹ麯����ʵ�ֹ������£�
	 * 
	 * void convert(int n)
	 * {
	 * 	if(n > 0)
	 * 	{
	 * �����������n/2��Ӧ�Ķ�������;
	 * ���n%2;
	 * }
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		convert(n);
	}
	 static void convert(int n) {
		 if(n>0) {
			 convert(n/2);
			 System.out.print(n%2);
		 }
	 }
}
