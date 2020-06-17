import java.util.Scanner;

public class SumTime_1095 {
	/*
	 * ��Ŀ���� 
	 * �Ӽ�����������ʱ���(24Сʱ�ƣ����������ʱ���֮���ʱ������ʱ�����á�Сʱ:����:�롱��ʾ��Ҫ�������������������������main()
	 * �е�������������ʵ����Ӧ�Ĺ���,����main����ϵͳ�Ѿ�ʵ�֣���ֻ��Ҫ������������������Ķ��塣 
	 * int HmsToS(int h, int m, int s) // ���������ֱ�Ϊ���ڱ�ʾһ��ʱ����ʱ���֡��� { //��ʱ����ת�����벢���ء� } 
	 * void PrintTime(int s); //�β�s��ʾһ��ʱ��εĳ��ȣ���λ���� { //��ʱ���ת��Ϊ��Ӧ�ġ�Сʱ:����:�롱 ��ʽ��� }
	 * 
	 * ����
	 * ���������ж��顣ÿ������������С���һ��Ϊʱ���1���ڶ���Ϊʱ���2��ʱ�����ԡ�HH:MM:SS���ĸ�ʽ���롣�������ݱ�֤ʱ���1����ʱ���2�� 
	 * 
	 * ���
	 * ��Ӧÿ�����ݣ���һ��������ԡ�HH:MM:SS���ĸ�ʽ���ʱ������ע�ⲻ����λҪ��ռλ��0����ʽ�ο����������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String str1 = scan.nextLine();
			String time1[] = str1.split(":");
			int h1 = Integer.valueOf(time1[0]);
			int m1 = Integer.valueOf(time1[1]);
			int s1 = Integer.valueOf(time1[2]);
			
			String str2 = scan.nextLine();
			String time2[] = str2.split(":");
			int h2 = Integer.valueOf(time2[0]);
			int m2 = Integer.valueOf(time2[1]);
			int s2 = Integer.valueOf(time2[2]);
			
			int ss = HmsToS(h2,m2,s2)-HmsToS(h1,m1,s1);
			PrintTime(ss);
		}
	}
	
	public static int HmsToS(int h, int m, int s) {// ���������ֱ�Ϊ���ڱ�ʾһ��ʱ����ʱ���֡���,��ʱ����ת�����벢���ء� 
		
		return h*3600+m*60+s;
	} 
	
	public static void PrintTime(int s){//�β�s��ʾһ��ʱ��εĳ��ȣ���λ���� { //��ʱ���ת��Ϊ��Ӧ�ġ�Сʱ:����:�롱 ��ʽ��� }
		int h = s/3600;
		int m = s%3600/60;
		int s1 = s%60;
		String hs;
		String ms;
		String s1s;
		if(h<10) {
			hs = "0"+String.valueOf(h);
		}else {
			hs = String.valueOf(h);
		}
		if(m<10) {
			ms = "0"+String.valueOf(m);
		}else {
			ms = String.valueOf(m);
		}
		if(s1<10) {
			s1s = "0"+String.valueOf(s1);
		}else {
			s1s = String.valueOf(s1);
		}
		System.out.println(hs+":"+ms+":"+s1s);
	}

}
