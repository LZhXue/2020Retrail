import java.math.BigInteger;
import java.util.Scanner;
/**java��long��Ϊ�����������,���ڳ���long�͵��������ȥ��ʾ��.��Java��������,����long�͵������Ѿ����ܱ���Ϊ������,���Ǳ���װ��BigInteger����.��BigInteger����,ʵ���������㶼�Ƿ�����ʵ��,�����ǲ��������.
BigInteger��Ĺ��췽��:
BigInteger b = new BigInteger(str);
���췽����,�����ַ�������ʽ��������
����������룺
public static void main(String[] args) {
     	  //�����ݷ�װΪBigInteger����
          BigInteger big1 = new BigInteger("12345678909876543210");
          BigInteger big2 = new BigInteger("98765432101234567890");
          //addʵ�ּӷ�����
          BigInteger bigAdd = big1.add(big2);
          //subtractʵ�ּ�������
          BigInteger bigSub = big1.subtract(big2);
          //multiplyʵ�ֳ˷�����
          BigInteger bigMul = big1.multiply(big2);
          //divideʵ�ֳ�������
          BigInteger bigDiv = big2.divide(big1);
}*/


public class BigIntegerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		BigInteger bg = new BigInteger("1");
		for (int i = 1; i <= a; i++) {
			String n = String.valueOf(i);
			bg = (new BigInteger(n)).multiply(bg);

		}
		System.out.println(bg);
	}
}
