package com.kook.ch07Project;

public class Ex07_14 {
	// 멤버 변수
	private int outerIv = 0;
	static int outerCv = 0;

	// 접근제어자가 없으므로 default, 내 패키지 안에서 어디서나 사용 가능
	class InstanceInner {
		// 인스턴스형 내부 클래스는 부모 클래스의 멤버 이므로 다른 멤버 사용 가능
		int iiv = outerIv;
		int iiv2 = outerCv;

	}

	static class StaticInner {
		// 클래스형 내부 클래스는
		// static은 static멤버는 그대로 사용하나 인스턴스멤버는 외부객체를 만들어 사용
		// int siv = ex07.outerIv; 객체를 만들어야 사용 가능
		static int scv = outerCv;

	}
	
	void myMethod() {
		int lv = 0;//메서드의 변수로 로칼 변수
		final int LV = 0;//메서드의 변수로 로칼 변수인데 Local클래스에서 사용위해 final 사용(자바에서 생략 가능)
		
		class LocalInner{
			//외부클래스 멤버는 모두 사용 가능(클래스나 인스턴스 바로 접근)
			int liv = outerIv;
			int liv2 = outerCv;
			//원래는 자바 8버전에는 final이 붙은 지역변수만 사용가능하지만
			//지금은 final 생략
			//lv = 4 는 final이 생략된거이므로 사용 불가능
			int liv3 = lv;
			int liv4 = LV;
		}
	}

	public static void main(String[] args) {
		Ex07_14 ex07 = new Ex07_14();
		InstanceInner ex07In = ex07.new InstanceInner();
	
	}
}
