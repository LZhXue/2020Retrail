import java.util.Scanner;

public class A_1215 {
	/*
	 * 1--1�� abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9,
	 * 0--0,����ô�򵥣������������г��ֵ�Сд��ĸ����ɶ�Ӧ�����֣����ֺ������ķ��Ŷ������任��������������û�пո�
	 * �������г��ֵĴ�д��ĸ��߳�Сд֮��������һλ���磺X���ȱ߳�Сд����������һλ��������y����򵥰ɡ���ס��z��������aŶ��
	 * 
	 * ���� �����������������ݡ�������һ�����ģ����볤�Ȳ�����100���ַ�������ֱ���ļ���β��
	 * 
	 * ��� ���Ԩ�����������ġ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String str = scan.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(Character.isLowerCase(ch)) {//Сд��ĸ
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
				}else if(Character.isUpperCase(ch)) {//��д��ĸ
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
				}else {//��������
					sb.append(ch);
				}
			}
			System.out.println(sb.toString());
		}
	}

}
