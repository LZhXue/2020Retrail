import java.util.Scanner;

public class A_1147 {
	/*
	 * ��Ŀ���� 
	 * ���������������飬����a��n��Ԫ�أ�����b��m��Ԫ�أ�1<=m<=n<100,���������b�Ƿ�������a�������顣
	 * ��������a��ĳ��Ԫ��a[i]��ʼ����b[0]=a[i],b[1]=a[i+1] ,......��b[m]=a[i+m]���������b������a�������顣
	 * 
	 * ���� 
	 * �����һ��Ϊ��������n��m���ڶ���Ϊ����a��n��������������Ϊ����b��m��������������֮���ÿո������
	 * 
	 * ��� 
	 * ���ռһ�С���b��a�������飬���������������λ��i��ע���±��0��ʼ�����������No Answer����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.nextLine();
		int a[] = new int[n];
		int b[] = new int[m];
		for(int i = 0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		scan.nextLine();
		for(int i = 0;i<m;i++) {
			b[i] = scan.nextInt();
		}
		boolean flag = false;
		for(int i = 0;i<n;i++) {
			if(a[i]==b[0]) {
				for(int j = 0;j<m;j++) {
					if(a[i+j]!=b[j]) {
						break;
					}
					if(a[i+j]==b[j]&&j==m-1) {
						flag = true;
					}
				}
			}
			if(flag) {
				System.out.println(i);
				break;
			}
		}
		if(!flag) {
			System.out.println("No Answer");
		}
	}

}
