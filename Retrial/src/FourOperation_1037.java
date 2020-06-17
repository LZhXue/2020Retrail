import java.util.Formatter;
import java.util.Scanner;

public class FourOperation_1037 {
	/*
	 * ����һ���򵥵�����������ʽ����������ʵ����һ������������̼������� 
	 * 
	 * ����
	 * ���ʽ�ĸ�ʽΪ��s1 op s2��
	 * s1��s2������ʵ����op��ʾ���������(+,-,*,/)��Ҳ�����������ַ� 
	 * 
	 * ���
	 * ���������Ϸ���������ʽ��ֵ��
	 * ����������Ϸ�����г�������ʱ������0�������"Wrong input!"��
	 * �����С���������λ��
	 * 
	 * ��ʾ��������0,��|s2|��1e-10(��10��-10�η����ж�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String op = scan.nextLine();
		String opr = findOp(op);
		double re = 0;
		if(opr.compareTo("E")==0) {
			System.out.println("Wrong input!");
		}else {
			if(opr.compareTo("+")==0) {
				String arr[] = op.replace('+', '#').split("#");//��+�ŷָ��ַ����ǲ���ȷ�ģ���Ϊ+����java�����������������ַ�����
				double op1 = Double.valueOf(arr[0]);
				double op2 = Double.valueOf(arr[1]);
				re =op1+op2;
			}else if(opr.compareTo("-")==0) {
				String arr[] = op.replace('-', '#').split("#");
				double op1 = Double.valueOf(arr[0]);
				double op2 = Double.valueOf(arr[1]);
				re =op1-op2;
			}else if(opr.compareTo("*")==0) {
				String arr[] = op.replace('*', '#').split("#");
				double op1 = Double.valueOf(arr[0]);
				double op2 = Double.valueOf(arr[1]);
				re =op1*op2;
			}else if(opr.compareTo("/")==0&&(Double.valueOf(op.replace('/', '#').split("#")[1])<Math.pow(10, -10))
					||Double.valueOf(op.replace('/', '#').split("#")[1])>-(Math.pow(10, -10))) {
				String arr[] = op.replace('/', '#').split("#");
				double op1 = Double.valueOf(arr[0]);
				double op2 = Double.valueOf(arr[1]);
				re =op1/op2;
			}else {
				System.out.println("Wrong input!");
			}
			Formatter fre = new Formatter().format("%.2f",re);
			System.out.println(fre);
		}
		
		
		
	}
	
	public static String findOp(String op) {
		int length = op.length();
		String ch = null;
		for(int i = 0;i<length;i++) {
			if(op.charAt(i)=='+') {
				ch = "+";break;
			}else if(op.charAt(i)=='-') {
				ch ="-";break;
			}else if(op.charAt(i)=='*') {
				ch = "*";break;
			}else if(op.charAt(i)=='/') {
				ch = "/";break;
			}else {
				if(i == length-1) {//�ҵ����һ��Ҳû���ҵ��Ϸ�������
					ch = "E";
				}
			}
		}
		return ch;
	}
}


/*�e��д�ģ���д���ύ�𰸴���
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String expression = sc.nextLine();
            String[] expArr = expression.split(" ");
            double a = Double.parseDouble(expArr[0]);
            double b = Double.parseDouble(expArr[2]);
            switch (expArr[1]) {
                case "+":
                    System.out.printf("%.2f\n", a + b);
                    break;
                case "-":
                    System.out.printf("%.2f\n", a - b);
                    break;
                case "*":
                    System.out.printf("%.2f\n", a * b);
                    break;
                case "/" :
                    if(Math.abs(b) < 1e-10)
                        System.out.println("Wrong input!");
                    else
                        System.out.printf("%.2f\n", a / b);
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }
}
 */