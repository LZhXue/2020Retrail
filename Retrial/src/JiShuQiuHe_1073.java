import java.util.Scanner;

public class JiShuQiuHe_1073 {

	/*
	 * ��֪��Sn= 1��1��2��1��3������1��n����Ȼ��������һ������K����n�㹻���ʱ��Sn����K��
	 * �ָ���һ������K��1<=k<=15����Ҫ������һ����С��n��ʹ��Sn��K��
	 * 
	 *  ���� 
	 *  �������� k 
	 *  
	 *  ��� 
	 *  ��Ļ��� n
	 */public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 int k = scan.nextInt();
		 double sn = 0;
		 double fm = 1;
		 while(sn<=k) {
			 sn = sn+1/fm;
			 fm++;
		 }
		 System.out.printf("%.0f",fm-1);
	}

}
