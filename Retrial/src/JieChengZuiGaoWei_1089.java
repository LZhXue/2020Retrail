import java.util.Scanner;

public class JieChengZuiGaoWei_1089 {

	/*
	 * ��Ŀ���� 
	 * ����һ��������n�����n!�����λ�ϵ����֡� 
	 * 
	 * ���� 
	 * ����һ��������n��n������1000���� 
	 * 
	 * ��� 
	 * ���n!�����λ�ϵ����֡�
	 * 
	 * ֪ʶ�㣺������ʾ��Χ�Ĵ�����ʾ
	 * DaShuBiaoShi.java
	 * 
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
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
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
