import java.util.Scanner;

public class ZuiJinZuXian_1110 {

	/*
	 * ����ͼ��ʾ����������1, 2, 3, ...�����һ�����޴�Ķ���������ĳһ����㵽����㣨�����1 �Ľ�㣩����һ��Ψһ��·����
	 * �����10��������·����(10, 5, 2, 1)�� ��4 ��������·����(4, 2,1)���Ӹý�㵽������·���ϵ����н���Ϊ�ý������ȡ����ڵ�������ǣ�����x
	 * ��y����x��y�������ͬ���ȣ����磬10��4�����ͬ������2��10��5�������ͬ������5�� 
	 * ����ݹ麯�� int common(int x, int y)
	 * { ���x==y, return x; 
	 * ���x>y����x/2��y�Ĺ�ͬ����; 
	 * ������x��y/2�Ĺ�ͬ����; } 
	 * 
	 * ���� 
	 * ����ֻ��һ�У���������������x��y����������������������1000��
	 * 
	 * ��� 
	 * ���ֻ��һ������������x��y�������ͬ���ȡ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(common(x,y));
	}
	
	public static int common(int x, int y)
	{
		if(x==y)
		  return x;
		else
		  return x>y? common(x/2,y):common(x,y/2);
	}

}
