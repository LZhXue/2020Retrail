import java.util.Scanner;

public class A_1276 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0;i<n;i++) {
			int sum = 0;
			char ch[] = scan.nextLine().toCharArray();
			for(int j = 1;j<ch.length;j++) {
				if(ch[j]!=ch[j-1]) {
					sum++;
				}
			}
			if(ch[0]=='0') {
				System.out.println(sum);
			}
			else {
				System.out.println(sum+1);
			}
		}
	}

}
