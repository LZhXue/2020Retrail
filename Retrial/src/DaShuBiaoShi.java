import java.util.Scanner;
public class DaShuBiaoShi{
	public static void main(String[] args){
		/**����׳� ������һ��������n�����n!��ֵ������n!=1*2*3*��*n����
		 * n!���ܴܺ󣬶�������ܱ�ʾ��������Χ���ޣ���Ҫʹ�ø߾��ȼ���ķ�����
		 * ʹ��һ������A����ʾһ��������a��A[0]��ʾa�ĸ�λ��A[1]��ʾa��ʮλ���������ơ�
		 * ��a����һ������k��Ϊ������A��ÿһ��Ԫ�ض�����k����ע�⴦����Ӧ�Ľ�λ��
		 * ���Ƚ�a��Ϊ1��Ȼ���2����3�����˵�nʱ�����õ���n!��ֵ��
		 */
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		//"jin"��ʾ��Ҫ������λ,"chengji"��ʾÿһλ��i�ĳ˻�
		int jin=0,chengji,j,i;
		//��n�㹻��ʱ��int��long�����ܴ�����n�Ľ׳ˣ�
		//�������齫�׳˰���ʮ��ǧ��˳��ÿһ��λ�����������arr��
		int[] arr = new int[10000];
		//Ϊ���鸽��ֵ10000����
		for(i=1;i<arr.length;i++) arr[i]=0;
		arr[0]=1;
		//��׳�
		for(i=2;i<=n;i++){ //�Ѿ�Ϊarr[0]��ֵΪ1������i��2��ʼ����
			for(j=0;j<arr.length;j++){ //��֪����׳�ʱ���õ���λ������ѭ��arr.length��
				chengji=arr[j]*i;  //��ÿһλ�ĳ˻�
				if(chengji+jin<10){ //����˻�+ǰһλ������<10,������ʮ��һ
					arr[j]=arr[j]*i+jin;
					jin=0;  //��Ҫ��jin���㣬����ʹ��һλ���ܵ�����������jin��Ӱ��
				}
				else{ //��ʮ��һ
					arr[j]=(chengji+jin)%10;//��λ��������
					jin=(chengji+jin)/10; //��һλ���jin
				}
			}
		}
		//��arr[arr.length-1]��arr[0]������У�
		//��������һ����Ϊ0����ʱ��ʼ�������Ԫ��
		//���������break;�������ѭ��
		for(i=arr.length-1;i>=0;i--){
			if(arr[i]!=0){
				for(j=i;j>=0;j--){
					System.out.print(arr[j]);
				}
				break;
			}
		}
	}
}
