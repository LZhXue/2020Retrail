import java.util.Scanner;

public class A_1121 {
	/*
	 * ��Ŀ���� 
	 * ��ĳһ�߲㽨����ֻ��һ�����ݣ����㰴��һ����ʱ�����ݻ����е���һ�㡣
	 * ��֪����ÿ����һ����6�룬�½�һ����4�룬����Ҫͣ�����ǲ�ͣ��5�롣
	 * ����N��������ɵ�һ�������б����ݽ�������Ӧ�����ݴ�0�㿪ʼ���У��������й��̽���֮ǰ���᷵��0�㡣
	 * ע�⣬��������������������ȣ�������ͬһ��ִ����������ͬ���񣬿������Ϊ�������Ѿ�ͣ��5�룬��Ҫ����ʱ��������ͬһ�㰴���ż��������ֿ��Ų�ͣ��5�롣 
	 * 
	 * ����
	 * ��������У���һ����һ��������N��N<=1000)������ͣ�����Σ��ڶ��е�N�����ִ����⼸������ͣ����¥�㡣 
	 * 
	 * ���
	 * ���������ɸ��������������ʱ�䣬����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		sum = sum+arr[0]*6+5;
		for(int i = 1;i<n;i++) {
			int temp = (arr[i]-arr[i-1]);
			if(temp>0) {
				sum = sum+temp*6+5;
			}else {
				sum = sum+(-1*temp*4)+5;
			}
		}
		System.out.println(sum);
	}

}
