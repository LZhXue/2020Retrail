import java.util.Scanner;

public class A_1135 {

	/*
	 * ����
	 * ���뺬��һЩ�����飬ÿ�����ݰ������֣������ո���ִ���������w��������λ���ۣ�һ��Ϊdouble�������͵���p��double��������ʾ�����Ԫ��������ˣ�
	 * ÿ�����ݵĲ˼۾����������ϵ��۰������֡������͵���֮�䶼�пո�����ġ� 
	 * 
	 * ���
	 * ֧���˼۵�ʱ��������С֧����λ�ǽǣ�����������֧����ʱ�������������ķ����ѷ�ͷȥ������������һ������Ϊ�ǵĲ˼�������
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		while(scan.hasNext()) {
			String str = scan.nextLine();
			String arr[] = str.split(" +");
			sum+=Double.valueOf(arr[1])*Double.valueOf(arr[2]);
		}
		   System.out.printf("%.1f",sum);
	       System.out.println();
	}

}

