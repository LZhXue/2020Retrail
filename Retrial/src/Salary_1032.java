import java.util.Formatter;
import java.util.Scanner;

public class Salary_1032 {
	
	/*
	 * ĳ��˾�涨��������Ա�����ɻ������ʺ����������������ɣ����л���������1500Ԫ/�£�������ɹ������£� 
	 * ���۶�С�ڵ���10000Ԫʱ������5%��ɣ�
	 * ���۶����10000Ԫ��С�ڵ���50000Ԫʱ������10000���ְ���3%��ɣ� 
	 * ���۶����50000Ԫʱ������50000���ְ���2%��ɡ�
	 * ��д���򣬸������۶����Ա�����롣
	 * 
	 * ����
	 * ����һ��������ʾ���۶�
	 * 
	 * ���
	 * ���Ա����нˮ������2λС����
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		double tiCheng = 0;
		if(x<=10000) {
			tiCheng = x*0.05;
		}else if(x>10000&&x<=50000){
			tiCheng = (x-10000)*0.03+500;
		}else if(x>50000) {
			tiCheng = 1700+(x-50000)*0.02;
		}
		Formatter fx = new Formatter().format("%.2f",1500+tiCheng);
		System.out.println(fx);
	}

}
