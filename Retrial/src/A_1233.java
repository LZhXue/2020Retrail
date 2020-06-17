import java.util.Scanner;

public class A_1233 {
	/* µ•¥ ƒÊ÷√ */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String str[] = scan.nextLine().split(" +");
			int len = str.length;
			for(int i = 0;i<len;i++) {
				StringBuilder sb = new StringBuilder(str[i]);
				sb.reverse();
				if(i == len-1) {
					System.out.println(sb.toString());
				}else {
					System.out.print(sb.toString()+" ");
				}
			}
		}
	}

}
