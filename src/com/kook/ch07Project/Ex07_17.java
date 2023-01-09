package com.kook.ch07Project;

public class Ex07_17 {
	//바로 해당 조상클래스나 인터페이스 객체를 원하는 위치에 만들어 사용
	
	//인스턴스형 익명 클래스
	Object iv = new Object() {
		//생성자 뒤에 구현부를 만들어 원래 클래스로 처리할 내용을 작성
		void method() {
			
		}
	};
	//클래스형 익명클래스
	static Object cv = new Object() {
		void metode() {
			
		}
	};
	//로컬 익명클래스
	void myMethod() {
		Object lv = new Object() {
			
		};
	}
	
	public static void main(String[] args) {
		

	}

}
