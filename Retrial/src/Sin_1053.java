import java.util.Scanner;

public class Sin_1053 {

	/*sin(x)=x-x^3/3!+x^/5!-x^7/7!
 	 * ����x���������湫ʽ��ǰ10��͡�
	 * 
	 * ����
	 * ����һ��ʵ��x�� 
	 * 
	 * ��� 
	 * ���һ��ʵ���������е�ǰ10��ͣ��������3λС����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double fz = x;
		double fm = 1;
		double sum = 0;
		for(int i = 1; i<11; i++) {
			if(i%2==0) {sum = sum - fz/fm;}
			else {sum = sum + fz/fm;}
			fz = fz*x*x;
			fm = fm*(i*2)*(i*2+1);
		}
		System.out.printf("%.3f",sum);

	}

}
