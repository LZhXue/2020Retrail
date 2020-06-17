package com.dugking.network;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		Person p=new Person();
		Person p2=new Person();
		
		p=null;
		p2=null;
		
		System.out.println("执行睡眠.....");
		Thread.sleep(3000);
		System.out.println("执行对象没有被回收.....");
		Thread.sleep(3000);
		System.out.println("执行gc.....");
		System.gc();
		
	}
}
