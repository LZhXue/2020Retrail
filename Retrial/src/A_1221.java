import java.util.Scanner;

public class A_1221 {
	/*
	 * 我们都知道DNA中的信息是以四种化学碱基组成的密码形式存储的：腺嘌呤（a）、鸟嘌呤（G）、胞嘧啶（C）和胸腺嘧啶（T）。
	 * DNA碱基彼此配对，A与T，C与G ，形成称为碱基对的单位。
	 * 
	 * 现在，我们给你DNA序列的一部分，你能告诉我另一部分吗。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i =0;i<n;i++) {
			String str = scan.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int j = 0;j<str.length();j++) {
				if(str.charAt(j)=='A') {
					sb.append('T');
				}else if(str.charAt(j)=='T') {
					sb.append('A');
				}else if(str.charAt(j)=='C') {
					sb.append('G');
				}else if(str.charAt(j)=='G') {
					sb.append('C');
				}
			}
			System.out.println(sb.toString());
		}
	}

}
