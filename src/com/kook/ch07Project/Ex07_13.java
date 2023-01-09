package com.kook.ch07Project;

public class Ex07_13 {
	int outerV = 100;
	class InstanceInner {//인스턴스형 내부 클래스
		int intIv = 1122;
	}

	static class StaticInner {//클래스형 내부 클래스
		int intCv = 100;
	}
	
	//iv는 인스턴스 멤버변수/ 인스턴스 내부 클래스의 객체로 사용 가능
	InstanceInner iv = new InstanceInner();
	//cv는 클래스형 멤버변수/ 클래스형 내부 클래스를 바로 사용 가능 
	static StaticInner cv = new StaticInner();

	//ex07_13 클래스의 클래스형 맴버 메서드
	static void staticMethod() {
		//static메서드에서는 인스턴스멤버에 바로 접근할 수 없다
		//일반클래스의 static메서드 안에서 자기 클래스의 인스턴스멤버 접근시 자기 클래스 객체 만들어 접근
		Ex07_13 outer = new Ex07_13();
		InstanceInner obj1 = outer.new InstanceInner();
		
		//static메서드는 static에 바로 접근 가능
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod() {
		//인스턴스 메서드는 인스턴스 멤버, 클래스형 멤버 접근 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//로컬 클래스는 밖에서 사용 못함
		//LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalClass{
			int intLv = 123;
		}
		LocalClass lv = new LocalClass();
	}
	
	
	
	public static void main(String[] args) {
		staticMethod();// main은 static이므로 static멤버인 staticMethod()는 사용 가능
		Ex07_13 outer = new Ex07_13();
		outer.instanceMethod();
		outer.staticMethod(); 
		//static 클래스 호출 : 자기클래스객체.클래스멤버 해도 상관없지만 안하는게 권고 
		
		//static메서드 안에서 자기 클래스의 인스턴스 멤버 접근시 자기 클래스 객체 만들어 접근
		Ex07_13.InstanceInner inner = outer.new InstanceInner();
		
		System.out.println(inner.intIv);
		outer.myMethod();
	}

}
