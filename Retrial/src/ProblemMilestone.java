import java.util.Scanner;

public class ProblemMilestone {

	/*
	 * ��Ŀ���� 
	 * ĳ��������һ����̱�����̱������ʾһ��������Ϊ�ó��߹��Ĺ�������Ȼ�������̱��и�ë����
	 * �����Ǵ�3�䵽5������������4����̱�����λ����λ��ʮλ����λ�ȣ��ϵ����ֶ�����ˡ�
	 * ���磬�����̱���ʾ339,�����߹�1����֮�󣬸���̱���ʾ350�� 
	 * 
	 * ����
	 * ����һ������num����ʾ��̱���ʾ����ֵ��1 < num < 1000����һ����������4�� 
	 * 
	 * ��� 
	 * ���һ��������Ϊ������ʵ����ʻ�Ĺ����������磬�������̱���ʾ55����ʵ���߹��Ĺ�������40��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++){
	        if(i%10!=4&&i/10%10!=4&&i/100%10!=4){
	            sum++;
	        }
	    }
		System.out.println(sum);
	}

}
