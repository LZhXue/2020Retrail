import java.util.Arrays;
import java.util.Scanner;

public class A_1143 {
	/*
	 * ����n������ÿ�����Ľ���������������kָ����k>=2��k<=10�� �����������Ӧ��ʮ��������
	 * Ҫ�������һ��KToD()������һ��main()������KToD() �����Ĺ����ǽ�k������ת��Ϊʮ�������������๦����main()������ʵ�֡� 
	 * int KToD(char str[], int k) { //��������k������str��Ӧʮ�������� } 
	 * 
	 * ����
	 * ������������n��Ȼ����n�У�ÿ�а���һ���ַ�����һ������k���ÿո����,���ַ�����ʾһ��k�����������������Ϊ�Ǹ����� 
	 * 
	 * ��� 
	 * �����������Ӧ��ʮ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String line[] = scan.nextLine().split(" +");
			char str[] = line[0].toCharArray();
			int k = Integer.valueOf(line[1]);
			arr[i] = KToD(str,k);
		}
		Arrays.parallelSort(arr);
		System.out.println(arr[n-1]);
	}
	public static int KToD(char str[], int k) {
		int sum = 0;
		int len = str.length;
		for(int i = 0;i<len;i++) {
			int temp = str[i]-48;
			sum += temp*Math.pow(k, len-i-1);
		}
		return sum;
	}
}
