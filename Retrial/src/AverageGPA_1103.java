import java.util.Scanner;

public class AverageGPA_1103 {

	/*
	 * �γ̼���ļ��㷽��ͨ���ǣ����ٷ��Ƴɼ�-50)/10ȡ�����ɼ�100����Ӧ����Ϊ5���ɼ�90~99��Ӧ����Ϊ4��......���ɼ�60~69��Ӧ����Ϊ1���ɼ�С��60����Ӧ����Ϊ0��
	 * ƽ��ѧ�ּ���ļ��㷽���ǣ��ǽ�ѧ���޹���ÿһ�ſγ̵ļ�����Ը��ſγ̵�ѧ�֣��ۼӺ��ٳ�����ѧ�֡���̼���һ��ѧ����ƽ��ѧ�ּ��㡣 
	 * 
	 * ����
	 * ����n��ʾ��n�ſγ̣�Ȼ������n�ſγ̵�ѧ�ֺͳɼ���ѧ�ֺͳɼ����������� 
	 * 
	 * ��� 
	 * ���ƽ��ѧ�ּ��㣬����һλС����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		double sumG = 0;
		double sumK = 0;
		for(int i = 0;i<n;i++) {
			int num = scan.nextInt();
			int grade = scan.nextInt();
			sumG = sumG+num*GPA(grade);
			sumK = sumK+num;
		}
		System.out.printf("%.1f",sumG/sumK);
	}
	public static double GPA(int grade) {
		double re;
		if(grade==100) {
			re = 5;
		}else if(grade>=90&&grade<=99) {
			re = 4;
		}else if(grade>=80&&grade<=89) {
			re = 3;
		}else if(grade>=70&&grade<=79) {
			re = 2;
		}else if(grade>=60&&grade<=69) {
			re = 1;
		}else {
			re = 0;
		}
		return re;
	}
}
