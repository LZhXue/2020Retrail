package sortDemo;

public class Example1 {
	int name;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Person p=new Person();
		Person p2=new Person(); //局部变量
		
		p=null;
		
		Thread.sleep(3000); //当前程序 停止3秒 线程
		
		System.gc();
		
	}
}
