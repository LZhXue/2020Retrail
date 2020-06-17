import java.util.Scanner;

public class A_1130 {
	/*
	 * ��Ŀ���� 
	 * ���ǵ���ѧʱ��ѧ�������������
	 * 
	 * ���� 
	 * ����ֻ����һ��������n��1 <= n <= 30������ʾ��Ҫ�����������ǵĲ�����
	 * 
	 * ��� 
	 * �����Ӧ������������ǣ�ÿһ�������֮����һ���ո������
	 */
	public static void main(String[] args) {
		//�������������ǵ�����
        int row;
        Scanner scan = new Scanner(System.in);
        row = scan.nextInt();
        //����������ǵ�������
        int [][] tr = new int[row][];
        for(int i=0;i<tr.length;i++){
            tr[i] = new int[i+1];
        }
        //���������ǵ�ÿһ�е�һ��Ԫ�غ����һ��Ԫ�غ��м��Ԫ��
        for(int i=0;i<tr.length;i++){
            for(int j=0;j<tr[i].length;j++){
                tr[i][0] = 1;
                tr[i][tr[i].length-1] = 1;
                if(i>1 && j != 0 && j<i){        //�ų�ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ��
                    tr[i][j] = tr[i-1][j-1] +tr[i-1][j];        //��������м�Ԫ�صĹ�ʽ
                }
            }
        }
        //����������
        for(int i=0;i<tr.length;i++){
            for(int j=0;j<tr[i].length;j++){
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
	}

}
