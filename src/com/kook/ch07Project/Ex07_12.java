package com.kook.ch07Project;

public class Ex07_12 {//�ܺ� Ŭ������ abstract, final
	//�ν��Ͻ��� ���� Ŭ����
	class InstanceInner{
		int iv = 100;//�ν��Ͻ��� ���� Ŭ������ �ν��Ͻ��������
		//�ν��Ͻ��� ���� Ŭ���������� static ��� �Ұ���??
		//������ ���(final static)�� ����
		static int cv = 100;
	}
	static class StaticInner{
		int iv = 200;//�ν��Ͻ����� ��� ����
		static int cv = 200;
		final static int CONST = 200;
	}
	
	void myMethod(){
		class LocalInner{
			int iv = 300;
			final static int CV = 300;//static ��� �Ұ���
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.cv);
		System.out.println(StaticInner.cv);
		InstanceInner.cv = 200;
		System.out.println(InstanceInner.cv);
		
	}

}

class Outer{
	class Inner{
		static int cvv = 100;
	}
}
