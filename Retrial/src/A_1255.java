import java.util.Scanner;

public class A_1255 {
	/*
	 * 一本书的页码从自然数1 开始顺序编码直到自然数n。书的页码按照通常的习惯编排，每个页码都不含多余的前导数字0。例如，第6 页用数字6 表示，而不是06
	 * 或006 等。数字计数问题要求对给定书的总页码n，计算出书的全部页码中分别用到多少次数字0，1， 2，…，9。
	 * 
	 * 输入
	 * 给出表示书的总页码的整数n（1≤n≤2^31-1）
	 * 
	 * 输出
	 * 输出10行，在第k行输出页码中用到数字k-1 的次数，k=1，2，…，10。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[10];
		int[] pow10 = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};

		int len=(int) Math.log10(n)+1;
		System.out.println("len:"+len);
		
		while(len>0)
		{
			int tempMHigh=n/pow10[len-1];
			int qujian=tempMHigh;
			
			if(len==1)
			{
				for (int i = 0; i < tempMHigh; i++) {
					arr[i]+=1;
				}
			}else {

				for (int i = 0; i < 10; i++) {
					arr[i]+=qujian*(len-1)*Math.pow(10, len-2)+1;
				}
				for (int i = 1; i < qujian; i++) {
					arr[i]=arr[i]+pow10[len-1];
				}
				arr[tempMHigh]+=n%pow10[len-1]+1;
			}
			
			System.out.println("len:"+len);
			
			n=n%pow10[len-1];
			
			len=len-1;
			
		}
//		for
		
//		
		for(int i = 0;i<10;i++) {
			System.out.println(i+":"+arr[i]);
		}
				
	}

}

////for(int i = 1;i<=n;i++) {
////String str = String.valueOf(i);
////for(int j = 0;j<str.length();j++) {
////int temp = str.charAt(j)-48;
////arr[temp]++;
////}
////}
//for(int i = 1;i<=n;i++) {
//int temp = i;
//while(temp/10!=0) {
//arr[temp%10]++;
//temp = temp/10;
//}
//arr[temp]++;
//}