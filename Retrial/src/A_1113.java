import java.util.Scanner;

public class A_1113 {

	/*
	 * ��Ŀ���� ���³���Ĺ����Ǽ���Fibonacci���еĵ�n� ����fib()��һ���ݹ麯����
	 * �����д�ó��򣬼����n���ͬʱ��ͳ�Ƶ����˶��ٴκ���fib������main()��fib()�ĵ��ã��� #include<stdio.h> int
	 * fib(int k); int main(void ) { int n; scanf("%d", &n); printf("%d\n", fib(n));
	 * return 0; } int fib(int k) { if(k == 1 || k == 2) return 1; else return
	 * fib(k-1) + fib(k-2); }
	 * 
	 * ���� ����һ��������n��
	 * 
	 * ��� ����������У���һ����һ����������ʾ��n���ֵ���ڶ�������ݹ�����˶��ٴΣ������ʽ�����������
	 */
	public static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fib(n));
		System.out.println("�ݹ������"+sum+"��");
		
	}

	public static int fib(int k) {
		sum++;
		if (k == 1 || k == 2)
			return 1;
		else
			return fib(k - 1) + fib(k - 2);
	}

}
