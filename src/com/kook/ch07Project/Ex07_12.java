package com.kook.ch07Project;

public class Ex07_12 {//외부 클래스는 abstract, final
	//인스턴스형 내부 클래스
	class InstanceInner{
		int iv = 100;//인스턴스형 내부 클래스의 인스턴스멤버변수
		//인스턴스형 내부 클래스에서는 static 사용 불가능??
		//하지만 상수(final static)은 가능
		static int cv = 100;
	}
	static class StaticInner{
		int iv = 200;//인스턴스형도 사용 가능
		static int cv = 200;
		final static int CONST = 200;
	}
	
	void myMethod(){
		class LocalInner{
			int iv = 300;
			final static int CV = 300;//static 사용 불가능
			
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
