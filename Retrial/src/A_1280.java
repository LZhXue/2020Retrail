import java.util.Scanner;

public class A_1280 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0;i<n;i++) {
			int arr[] = new int[5];
			int t = scan.nextInt();
			for(int j = 0;j<t;j++) {
				int temp = scan.nextInt();
				arr[temp]++;
			}
			int man = 0;
			man = arr[1]/4+arr[2]/2+arr[4];
			arr[1] = arr[1]%4;
			arr[2] = arr[2]%2;
			if(arr[2]==0) {
				if(arr[3]>=arr[1]) {
					man = man+arr[3];
				}else {
					man = man+arr[3]+1;
				}
			}else {
				if(arr[1]<=2) {
					man = man+arr[3]+arr[2];
				}else{
					if(arr[3]==0) {
						man = man+arr[2]+1;
					}else {
						man = man+arr[2]+arr[3];
					}
				}
			}
			
			System.out.println(man);
		}
	}

}
