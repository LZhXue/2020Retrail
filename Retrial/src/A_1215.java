import java.util.Scanner;

public class A_1215 {
	/*
	 * 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9,
	 * 0--0,就这么简单，老王把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，声明：密码中没有空格，
	 * 而密码中出现的大写字母则边成小写之后往后移一位，如：X，先边成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。
	 * 
	 * 输入 输入包括多个测试数据。输入是一个明文，密码长度不超过100个字符，输入直到文件结尾。
	 * 
	 * 输出 输出渊子真正的密文。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String str = scan.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(Character.isLowerCase(ch)) {//小写字母
					if(ch=='a'||ch=='b'||ch=='c') {
						sb.append('2');
						continue;
					}else if(ch=='d'||ch=='e'||ch=='f') {
						sb.append('3');
						continue;
					}else if(ch=='g'||ch=='h'||ch=='i') {
						sb.append('4');
						continue;
					}else if(ch=='j'||ch=='k'||ch=='l') {
						sb.append('5');
						continue;
					}else if(ch=='m'||ch=='n'||ch=='o') {
						sb.append('6');
						continue;
					}else if(ch=='p'||ch=='q'||ch=='r'||ch=='s') {
						sb.append('7');
						continue;
					}else if(ch=='t'||ch=='u'||ch=='v') {
						sb.append('8');
						continue;
					}else if(ch=='w'||ch=='x'||ch=='y'||ch=='z') {
						sb.append('9');
						continue;
					}
				}else if(Character.isUpperCase(ch)) {//大写字母
					ch = Character.toLowerCase(ch);
					if(ch =='z') {
						sb.append('a');
						continue;
					}else {
						int temp = ch+1;
						char chh = (char) temp;
						sb.append(chh);
						continue;
					}
				}else {//其他不变
					sb.append(ch);
				}
			}
			System.out.println(sb.toString());
		}
	}

}
