import java.util.Scanner;

public class SortGrade_1033 {

	/*
	 * ����һ���ٷ��Ƴɼ�, ����ݰٷ��Ƴɼ�������Ӧ�ĵȼ���
	 * ת����ϵ���£� 90�ּ�����Ϊ��A����80~89Ϊ��B���� 70~79Ϊ��C����60~69Ϊ��D����60������Ϊ��E���� 
	 * 
	 * ���� 
	 * һ���ٷ��Ƴɼ���0~100������)�� 
	 * 
	 * ��� 
	 * �����Ӧ�ĵȼ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		if(grade>=90) {
			System.out.println("A");
		}else if(grade>=80&&grade<=89) {
			System.out.println("B");
		}else if(grade>=70&&grade<=79) {
			System.out.println("C");
		}else if(grade>=60&&grade<=69) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	}

}
