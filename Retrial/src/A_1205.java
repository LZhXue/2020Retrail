import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_1205 {

	/*
	 * ��Ŀ���� LCY���n����׼���͸���������Ů������������֪�����Ů���Ƿ�ϲ������
	 * ��ʱ��һ���������������������黨��������һ�������ʾ"��"���ڶ��������ʾ"����"�������������ʾ"��".....
	 * Ϊ��ʹ�������"��"��LCY��Ҫ��n������ѡ��һЩ�����ܰ������������͸����Ů���Ļ������������ٸ�������
	 * 
	 * ���� 
	 * ��������һ������T����ʾ����ʵ���ĸ����� ������T�����ʵ����ÿ��ʵ����������һ�У�����һ������n(1 <= n <= 100)��
	 * Ȼ������һ�У�n����a1,a2...an(1 <= ai <= 100),��ʾÿ���������Ļ���ĸ�����
	 * 
	 * ��� 
	 * ÿ��ʵ�����һ����������ʾLCY������Ͷ��ٸ���������Ů����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		for(int i = 0;i<total;i++) {
			int n = scan.nextInt();
			ArrayList<Integer> alOdd = new ArrayList<Integer>();
			ArrayList<Integer> alEven = new ArrayList<Integer>();
			int sum = 0;
			for(int j = 0;j<n;j++) {
				int temp = scan.nextInt();
				if(temp%2==0) {
					alEven.add(temp);
				}else {
					alOdd.add(temp);
				}
			}
			if(alOdd.size()==0) {//û�����������Ϳ϶�������
				System.out.println(0);
				continue;
			}else {//���������ܹ���ϳ�����
				for(int m = 0;m<alEven.size();m++) {//ż����ȫ��Ҫ
					sum+=alEven.get(m);
				}
				//������Ҫ������
				int lenOdd = alOdd.size();
				if(lenOdd%2==0) {//������ż��������С��һ����Ҫ
					Collections.sort(alOdd);//��������
					for(int m = 1;m<lenOdd;m++) {
						sum+=alOdd.get(m);
					}
				}else {//��������������ȫ��Ҫ
					for(int m = 0;m<lenOdd;m++) {
						sum+=alOdd.get(m);
					}
				}
				
			}
			System.out.println(sum);
		}
	}

}
