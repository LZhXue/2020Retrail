import java.util.Scanner;

public class A_1117 {
	/**
	 * ��Ŀ���� 
	 * ����n����������һ�����飬����������в���x�Ƿ���ڣ�������ڣ�ɾ��x�������ɾ��Ԫ�غ�����顣
	 * ��������ڣ������Not Found����
	 * ����һ�����Һ���find(),������a�в���x�����Ҳ�����������-1�����ҵ�����x���±꣬
	 * ����ԭ�����£� int find(int a[], int n, int x); Ȼ����main()�У��ȵ��ú���find(),������ʧ�������Not
	 * Found"�������ҳɹ����������һ���ж���ĺ���del()ɾ����Ԫ�أ��ٵ�����һ���е�PrintArr()���ɾ��Ԫ�غ���������ݡ� 
	 * 
	 * ����
	 * �����һ����һ��������n��1<=n<=10���� �ڶ�����n������������һ�����飻 ��������һ������x����ʾ������Ԫ�ء� 
	 * 
	 * ���
	 * ���ɾ��Ԫ�غ�����飬ÿ��Ԫ��ռ4�У��Ҷ��롣��������ڣ������Not Found��������������ж��x��ֻɾ���±���С���Ǹ���
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
		scan.nextLine();
		int del = scan.nextInt();
		int find = find(arr,n,del);
		if(find ==-1) {
			System.out.println("Not Found");
		}else {
			del(arr,n,find);
			PrintArr(arr,n-1);
		}
		
	}
	public static void PrintArr(int a[], int n) {
		for(int i = 0;i<n;i++) {
			System.out.printf("%4d",a[i]);
		}
	}
	public static int find(int a[], int n, int x) {
		for(int i = 0;i<n;i++) {
			if(a[i]==x) return i;
		}		
		return -1;
	}
	public static void del(int a[], int n, int i) {
		for(int j = 0;j<n;j++) {
			if(j==i) {
				for(int k = j;k<n-1;k++) {
					a[k] = a[k+1];
				}
				return;
			}
		}
	}
}
