import java.util.Scanner;

public class A_1199 {

	/*
	 * ����ϵͳ��Ҫ�ѽ���������������ļ�����ȷ������ļ����бȽϣ���������ļ���ȫ��ͬ��������ϵͳ���ء�Accepted����������������ļ����˿հ׷�(
	 * �ո�' ', �Ʊ��'\t', �� �س���'\n')֮���������ݶ���ͬ��������ϵͳ���ء�Presentation
	 * Error������������ϵͳ���ء�Wrong Answer����
	 * ���������ļ���һ��������ȷ�����һ�������û��Ľ��������������������Ǽ�������ϵͳӦ�÷���ʲô��Ϣ��
	 * 
	 * ����
	 * ��������������ʵ������һ������һ������T��ʾ����ʵ���ĸ�����Ȼ����T�����롣ÿ�������������֣�һ��������ȷ�����һ�������û��Ľ���������������ԡ�
	 * START����ʼ���ԡ�END���������ڡ�START���͡�END��֮�������Ҫ�жϵ����ݲ��֡�
	 * 
	 * ��� ����ÿһ������ʵ������һ��������������ϵͳӦ�÷��صĽ����Accepted��Presentation Error��Wrong Answer��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			String startsd = scan.nextLine();
			String standard = null;
			while(startsd.equals("")) {
				startsd = scan.nextLine();
			}//�������м�������һ��
			if(startsd.equals("START")) {
				StringBuilder sbsd = new StringBuilder();
				String nextsd = scan.nextLine();
				while(nextsd.equals("")) {
					nextsd = scan.nextLine();
				}//�������м�������һ��
				while(!nextsd.equals("END")) {
					sbsd.append(nextsd+"$");
					nextsd = scan.nextLine();
					while(nextsd.equals("")) {
						nextsd = scan.nextLine();
					}//�������м�������һ��
				}
				standard = sbsd.toString();
			}//ȡ��standard
			
			//��standardȥ�����е�
			StringBuilder sbsdsplit = new StringBuilder();
			sbsdsplit.append(standard);
			for(int m = 0;m<sbsdsplit.length();m++) {
				if(sbsdsplit.charAt(m)==' '||sbsdsplit.charAt(m)=='\n'||sbsdsplit.charAt(m)=='\t') {
					sbsdsplit.deleteCharAt(m);
				}
			}
			String standardSplit = sbsdsplit.toString();
			
			String startanser = scan.nextLine();
			while(startanser.equals("")) {
				startanser = scan.nextLine();
			}//�������м�������һ��
			if(startanser.equals("START")) {
				StringBuilder sbanser = new StringBuilder();
				String nextanser = scan.nextLine();
				while(nextanser.equals("")) {
					nextanser = scan.nextLine();
				}//�������м�������һ��
				while(!nextanser.equals("END")) {
					sbanser.append(nextanser+"$");
					nextanser = scan.nextLine();
				}
				String anser = sbanser.toString();
				for(int m = 0;m<sbanser.length();m++) {
					if(sbanser.charAt(m)==' '||sbanser.charAt(m)=='\n'||sbanser.charAt(m)=='\t') {
						sbanser.deleteCharAt(m);
					}
				}
				String anserSplit = sbanser.toString();
				if(standard.equals(anser)) {
					System.out.println("Accepted");
				}else if(standardSplit.equals(anserSplit)) {
					System.out.println("Presentation Error");
				}else {
					System.out.println("Wrong Answer");
				}
			}
		}
		
	}

}
