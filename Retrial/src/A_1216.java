import java.util.Scanner;

public class A_1216 {
	/*
	 * 下面是编码原则：
	 * （1） 如果访问到字符A，W，F就转化成I；
	 * （2） 如果访问到字符C，M，S就分别转化成L，o，v；
	 * （3）如果访问到字符D，P，G，B就转化成e；
	 * （4） 如果访问到字符L，X就分别转化成Y，u；
	 * （5） 其他字符均保持不变。
	 * （6） 遇到END就结束！
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		while(!str.equals("END")) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch=='A'||ch=='W'||ch=='F') {
					sb.append('I');
					continue;
				}else if(ch=='C') {
					sb.append('L');
					continue;
				}else if(ch=='M') {
					sb.append('o');
					continue;
				}else if(ch=='S') {
					sb.append('v');
					continue;
				}else if(ch=='D'||ch=='P'||ch=='G'||ch=='B') {
					sb.append('e');
					continue;
				}else if(ch=='L') {
					sb.append('Y');
					continue;
				}else if(ch=='X') {
					sb.append('u');
					continue;
				}else{
					sb.append(ch);
				}
			}
			System.out.println(sb.toString());
			str = scan.nextLine();
		}
	}

}
