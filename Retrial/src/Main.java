import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[10];
		for (int i = 1; i <= n; i++) {
			int temp = i;
			while (temp / 10 != 0) {
				arr[temp % 10]++;
				temp = temp / 10;
			}
			arr[temp]++;
		}
		
		for(int i = 0;i<10;i++) {
			System.out.println(i+":"+arr[i]);
		}
	}

}
