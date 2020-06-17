import java.math.BigInteger;
import java.util.Scanner;
/**java中long型为最大整数类型,对于超过long型的数据如何去表示呢.在Java的世界中,超过long型的整数已经不能被称为整数了,它们被封装成BigInteger对象.在BigInteger类中,实现四则运算都是方法来实现,并不是采用运算符.
BigInteger类的构造方法:
BigInteger b = new BigInteger(str);
构造方法中,采用字符串的形式给出整数
四则运算代码：
public static void main(String[] args) {
     	  //大数据封装为BigInteger对象
          BigInteger big1 = new BigInteger("12345678909876543210");
          BigInteger big2 = new BigInteger("98765432101234567890");
          //add实现加法运算
          BigInteger bigAdd = big1.add(big2);
          //subtract实现减法运算
          BigInteger bigSub = big1.subtract(big2);
          //multiply实现乘法运算
          BigInteger bigMul = big1.multiply(big2);
          //divide实现除法运算
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
