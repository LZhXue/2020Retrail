import java.util.Arrays;
import java.util.Scanner;

public class A_1153 {
	/*
	 * ��Ŀ���� 
	 * ����һ����(δ����)���������һ�����������������������������������ĳ��ȡ� 
	 * ���磺��������ǣ�1�� 2�� 3�� 3�� 4�� 4�� 5�� 5�� 5 ��6, ����ֻ��6������1, 2, 3-3, 4-4, 5-5-5 and 6. �����5���飬����Ϊ3���������3��
	 * 
	 * 
	 * ���� 
	 * ��һ��Ϊ����t((1 �� t �� 10))����ʾ��t��������ݡ� ÿ��������ݰ������У���һ��Ϊ����ĳ���n (1 �� n ��
	 * 10000)���ڶ���Ϊn����������������Mi�ķ�Χ����(1 �� Mi < 2^32)
	 * 
	 * 
	 * 
	 * ��� ��Ӧÿ�����ݣ���������������ĳ��ȡ�
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int max[]=new int[10];//��max�����¼ÿ���������������ĳ���
		for(int i = 0;i<t;i++) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int m = 0;m<n;m++) {
				arr[m] = scan.nextInt();
			}
			Arrays.parallelSort(arr);
			int count= 1;//����ÿ������count��ʼ��
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]==arr[j+1])//����
					count++;
				else
					count=1;//����ÿ������һ���в�ͬ������ʱ����ʼ��
				if(max[i]<count)//�ѳ��ֵ�����������max����
					max[i]=count;
			}
			System.out.println(max[i]);
		}
	}

}
