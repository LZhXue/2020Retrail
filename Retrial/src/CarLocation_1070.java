import java.util.ArrayList;
import java.util.Scanner;

public class CarLocation_1070 {
	/*
	 * ��Ŀ���� ��һ������С���������ʱ��Ϊ0)��λ��Ϊ(0,0)��������֪��������λ�á�
	 * С����ÿСʱ10������ٶ����ƶ����Ա�Ϊy�������Զ�Ϊx�����򣩡�
	 * С�����ܵ�һϵ������ʱ�������������1��ʾ������ת����2��ʾ������ת����3��ֹͣ���� ÿ�������ǰ����һ��ʱ����ǣ���������֪���������Ǻ�ʱ�����ġ�
	 * ���һ������һ���ǡ�ֹͣ��������������裬����С���ǳ�����������˲��ת�䡣
	 * ����������Ϊ����С����ʱ��Ϊ5��ʱ���յ�һ��������ת��������1����ʱ��10�յ�һ��������ת��������2����ʱ��15�յ�һ����ֹͣ��������3��
	 * ��ô�����ʱ��15��ʱ��С����λ�ý��ڣ�-50,100��������ֻҪ�����С������λ�ã���һ��������x���꣬�ڶ���������y���ꡣ
	 * 
	 * ����
	 * �������������ÿ������������time��command��ɣ���ʾ��ʱ��time��������command��command��ȡֵ��Χ1-3����������������
	 * 
	 * ��� ���ռһ�У�����������������ʾС��������λ�á���������֮���ɿո������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		int time1=0;
//		int commond1=0;
//		int x=0,y=0;
////		0 �� 1 �� 2 �� 3 ��
//		int direct=0;
//		
//		while(true) {
//			int time2 = scan.nextInt();
//			int command2 = scan.nextInt();
//			
//			if(commond1==0)
//			{
//				int road=(time2-time1)*10;
//				y=y+road;
//				if(command2==1) {
//					direct=(direct+4+1)%4;
//				}
//				else {
//					direct=(direct+4-1)%4;
//				}
//			}else {
//				if(direct%4==1)
//				{
//					x=x-(time2-time1)*10;
//				}else if(direct%4==2)
//				{
//					y=y-(time2-time1)*10;
//				}else if(direct%4==3)
//				{
//					x=x+(time2-time1)*10;
//				}else if(direct%4==0)
//				{
//					y=y+(time2-time1)*10;
//				}
//				
//				if(command2==1) {
//					direct=(direct+4+1)%4;
//				}
//				else {
//					direct=(direct+4-1)%4;
//				}
//				
//			}
//			
//			commond1=command2;
//			time1=time2;
//			
//			if(command2==3)
//			{
//				break;
//			}
//			
//			
//			
//			
//		}
//		System.out.println(x+" "+y);	
//		
//		
		
		
		
		Scanner scan = new Scanner(System.in);
		int time1 = 0;
		int command1 = 0;
		int time2 = scan.nextInt();
		int command2 = scan.nextInt();
		int x = 0, y = (time2-time1)*10;
		int direct = 0;// ���Ʒ���
		if(command2==1) {
			direct = (direct + 4+1) % 4;
		}else if(command2==2) {
			direct = (direct+ 4 - 1) % 4;
		}
		while (command2!=3) {
			if(direct==0) {
				y = y + (time2 - time1) * 10;
			}else if(direct==1) {
				x = x - (time2 - time1) * 10;
			}else if(direct==2) {
				y = y - (time2 - time1) * 10;
			}else if(direct==3) {
				x = x + (time2 - time1) * 10;
			}
			
			time1 = time2;
			time2 = scan.nextInt();
			command1 = command2;
			command2 = scan.nextInt();
			
			if(command2==1) {
				direct = (direct +4+ 1) % 4;
			}else if(command2==2) {
				direct = (direct+4 - 1) % 4;
			}else if(command2==3) {
				
				break;
			}

		}
		System.out.println(x+" "+y);	
	}

}
