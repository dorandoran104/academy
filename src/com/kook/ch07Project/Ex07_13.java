package com.kook.ch07Project;

public class Ex07_13 {
	int outerV = 100;
	class InstanceInner {//�ν��Ͻ��� ���� Ŭ����
		int intIv = 1122;
	}

	static class StaticInner {//Ŭ������ ���� Ŭ����
		int intCv = 100;
	}
	
	//iv�� �ν��Ͻ� �������/ �ν��Ͻ� ���� Ŭ������ ��ü�� ��� ����
	InstanceInner iv = new InstanceInner();
	//cv�� Ŭ������ �������/ Ŭ������ ���� Ŭ������ �ٷ� ��� ���� 
	static StaticInner cv = new StaticInner();

	//ex07_13 Ŭ������ Ŭ������ �ɹ� �޼���
	static void staticMethod() {
		//static�޼��忡���� �ν��Ͻ������ �ٷ� ������ �� ����
		//�Ϲ�Ŭ������ static�޼��� �ȿ��� �ڱ� Ŭ������ �ν��Ͻ���� ���ٽ� �ڱ� Ŭ���� ��ü ����� ����
		Ex07_13 outer = new Ex07_13();
		InstanceInner obj1 = outer.new InstanceInner();
		
		//static�޼���� static�� �ٷ� ���� ����
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod() {
		//�ν��Ͻ� �޼���� �ν��Ͻ� ���, Ŭ������ ��� ���� ����
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//���� Ŭ������ �ۿ��� ��� ����
		//LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalClass{
			int intLv = 123;
		}
		LocalClass lv = new LocalClass();
	}
	
	
	
	public static void main(String[] args) {
		staticMethod();// main�� static�̹Ƿ� static����� staticMethod()�� ��� ����
		Ex07_13 outer = new Ex07_13();
		outer.instanceMethod();
		outer.staticMethod(); 
		//static Ŭ���� ȣ�� : �ڱ�Ŭ������ü.Ŭ������� �ص� ��������� ���ϴ°� �ǰ� 
		
		//static�޼��� �ȿ��� �ڱ� Ŭ������ �ν��Ͻ� ��� ���ٽ� �ڱ� Ŭ���� ��ü ����� ����
		Ex07_13.InstanceInner inner = outer.new InstanceInner();
		
		System.out.println(inner.intIv);
		outer.myMethod();
	}

}
