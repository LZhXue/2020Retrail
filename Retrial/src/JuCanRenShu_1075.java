import java.util.Scanner;

public class JuCanRenShu_1075 {

	/*
	 * ��Ŀ���� 
	 * ���˼�ָ���������һ��Ȥζ��ѧ�⣺���ˡ�Ů�˺�С���ܼ�n���ˣ���һ�ҷ�����Է���������cost���ÿ�����˸���3���ÿ��Ů�˸���2���
	 * ÿ��С������1���������ٷ���̼������ˡ�Ů�˺�С�����м����� 
	 * 
	 * ���� 
	 * ������������������ʾ����n�ͻ���cost�� 
	 * 
	 * ���
	 * �������н⣬��������н⣬ÿ������������ݣ��������ˡ�Ů�˺�С�����������ÿո�ָ����������޽⣬�������No answer"��
	 */	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 int cost = scan.nextInt();
		 int flag = 0;
		 for(int i = 0;i<=n;i++) {
			 for(int j = 0;j<=n;j++) {
				 for(int k = 0;k<=n;k++) {
					 if((i+j+k==n)&&(3*i+2*j+k==cost)) {
						 flag = 1;
						 System.out.println(i+" "+j+" "+k);
					 }
				 }
			 }
		 }
		 if(flag==0) {
			 System.out.println("No answer");
		 }
	}

}
