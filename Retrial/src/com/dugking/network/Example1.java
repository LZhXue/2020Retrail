package com.dugking.network;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		Person p=new Person();
		Person p2=new Person();
		
		p=null;
		p2=null;
		
		System.out.println("ִ��˯��.....");
		Thread.sleep(3000);
		System.out.println("ִ�ж���û�б�����.....");
		Thread.sleep(3000);
		System.out.println("ִ��gc.....");
		System.gc();
		
	}
}
