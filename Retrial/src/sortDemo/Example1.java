package sortDemo;

public class Example1 {
	int name;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Person p=new Person();
		Person p2=new Person(); //�ֲ�����
		
		p=null;
		
		Thread.sleep(3000); //��ǰ���� ֹͣ3�� �߳�
		
		System.gc();
		
	}
}
