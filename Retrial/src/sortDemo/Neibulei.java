package sortDemo;

public class Neibulei {
	
//	1. 成员内部类
//	2. 静态内部类
	
//	3. 方法内部类
	
	static int num;
	public Neibulei(int num) {
		
	}
	class Student{
		
	}
	
	static class Teacher{
		
	}
	
	public static void main(String[] args) {
		num=10;
		
//		new Neibulei().new Student();
//		Neibulei.num
		// static  修饰的变量  会在程序加载进来的时候就进行初始化  
		//static 方法中调用 成员变量的话  成员变量  仍然需要是静态类型
		
		new Neibulei.Teacher();
	}
	
}
