import java.util.Arrays;
import java.util.Scanner;

public class A_1142 {

	/*
	 * ��Ŀ���� 
	 * ��������2 ���Ƶ�����Ҫ������������������Ӧ��ʮ������������С�����˳���䡣
	 * Ҫ�������һ��bToD()������һ��main()������bToD() �����Ĺ����ǽ���������ת��Ϊʮ�������������๦����main()������ʵ�֡� int
	 * bToD(char str[]) { //�������ض�������str��Ӧʮ�������� }
	 * 
	 * ���� 
	 * ��������2 ���Ƶ������ÿո�������������ݾ�Ϊ�Ǹ����������������Ȳ�����30��
	 * 
	 * ��� 
	 * ����Ӧ��ʮ������������С�����˳�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str[] = scan.nextLine().split(" +");
		char[] num1 = str[0].toCharArray();
		char[] num2 = str[1].toCharArray();
		char[] num3 = str[2].toCharArray();
		int arr[] = new int[3];
		arr[0] = bToD(num1);
		arr[1] = bToD(num2);
		arr[2] = bToD(num3);
		Arrays.parallelSort(arr);
		for(int i = 0;i<3;i++) {
			System.out.print(arr[i]+" ");
		}
//		System.out.println(n1+"---"+n2+"---"+n3);
	}
	public static int bToD(char str[]) {
		int sum = 0;
		int len = str.length;
		for(int i = 0;i<len;i++) {
			int temp = str[i]-48;
			sum += temp*Math.pow(2, len-i-1);
		}
		return sum;
	}
}
