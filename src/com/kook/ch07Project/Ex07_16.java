package com.kook.ch07Project;

public class Ex07_16 {
	public static void main(String[] args) {
		OuterEx07_16 out = new OuterEx07_16();
		OuterEx07_16.InnerEx07_16 in = out.new InnerEx07_16();
		in.method();
	}
}

class OuterEx07_16 {
	//변수 이름 같을시에 this사용
	int value = 30;

	class InnerEx07_16 {
		int value = 20;

		void method() {
			int value = 10;
			System.out.println("                  value : " + value);//로컬변수 10
			System.out.println("             this.value : " + this.value);// 내부 클래스 20
			System.out.println("OuterEx07_16.this.value : " + OuterEx07_16.this.value); //외부 클래스 10
		}
	}
}
