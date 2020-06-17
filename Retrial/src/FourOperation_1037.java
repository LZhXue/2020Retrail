import java.util.Formatter;
import java.util.Scanner;

public class FourOperation_1037 {
	/*
	 * 给你一个简单的四则运算表达式，包含两个实数和一个运算符，请编程计算出结果 
	 * 
	 * 输入
	 * 表达式的格式为：s1 op s2，
	 * s1和s2是两个实数，op表示的是运算符(+,-,*,/)，也可能是其他字符 
	 * 
	 * 输出
	 * 如果运算符合法，输出表达式的值；
	 * 若运算符不合法或进行除法运算时除数是0，则输出"Wrong input!"。
	 * 最后结果小数点后保留两位。
	 * 
	 * 提示：除数是0,用|s2|＜1e-10(即10的-10次方）判断
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
				String arr[] = op.replace('+', '#').split("#");//用+号分隔字符串是不正确的，因为+号在java代码中是用于连接字符串等
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
				if(i == length-1) {//找到最后一个也没有找到合法操作符
					ch = "E";
				}
			}
		}
		return ch;
	}
}


/*別人写的，我写的提交答案错误
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