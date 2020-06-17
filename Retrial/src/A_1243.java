import java.util.Scanner;

public class A_1243 {
	/*
	 * ���� 
	 * ���������ж��飬ÿ��ĵ�һ������������m��n����ʾӦƸMM���ܹ�����������Ȼ����m��������ÿ����n����m��n�Ķ������Ŀ��������
	 * 
	 * ��� 
	 * ����ÿ���������ݣ������������x,y��s���ֱ��ʾѡ�е�MM���кš��кźͷ�����
	 * note:�кź��кŴ�һ��ʼ������ж��MM�ķ�������ֵһ������ô���������ǰ���һ�������к���С���Ǹ�������к���ͬ��ȡ�к���С���Ǹ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int arr[][] = new int[m][n];
			int max = Integer.MIN_VALUE;
			int indexi = 0;
			int indexj = 0;
			for(int i = 0;i<m;i++) {
				for(int j = 0;j<n;j++) {
					int temp = scan.nextInt();
					arr[i][j] = temp;
					if(temp<0) {
						temp = temp*(-1);
					}
					if(max<temp) {
						max = temp;
						indexi = i;
						indexj = j;
					}
				}
			}
			
			System.out.println((indexi+1)+" "+(indexj+1)+" "+arr[indexi][indexj]);
		}
	}

}
