import java.util.Scanner;

public class FindJueDuiMax_1038 {
	/*
	 * ��Ŀ���� 
	 * ����3���������������ֵ�����Ǹ����� 
	 * 
	 * ���� 
	 * �������3��int��Χ�ڵ��������ÿո������
	 * 
	 * ���
	 * ����������о���ֵ������������ռһ�С�������ֵ��������Ψһ����������ȳ��ֵ��Ǹ���
	 * ���磬������Ϊ1 -3 3�������Ϊ-3��������Ϊ1 3 -3�����Ϊ3��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr1[] = {scan.nextInt(),scan.nextInt(),scan.nextInt()};
		int arr2[] = {0,0,0};
		for(int i =0;i<3;i++) {
			if(arr1[i]<0) {
				arr2[i] = (-1)*arr1[i];
			}else {
				arr2[i] = arr1[i];
			}
		}
		int index = 0;
		int max = arr2[0];
		for(int j=0;j<3;j++) {
			if(max<arr2[j]) {
				max = arr2[j];
				index = j;
			}
		}
		System.out.println(arr1[index]);
 	}

}
