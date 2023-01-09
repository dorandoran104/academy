package com.kook.ch07Quiz;

public class Ex07Quiz2 {

	public static void main(String[] args) {
		Animal myPig = new Pig();
		myPig.animalSound();

		Animal myDog = new Dog();
		myDog.animalSound();

		OuterClass out = new OuterClass();
		OuterClass.InnerClass inner = out.new InnerClass();
		 
		System.out.println("OuterClass x = " + out.x);
		System.out.println("InnerClass y = " + inner.y);
		System.out.println("StaticInnerClass z = " + OuterClass.StaticInnerClass.z);
		
		Animal2 dog1 = new Dog1();
		dog1.animalSound2();
		dog1.sleep2();
		System.out.println(Animal2.CONST);
		Animal2.sta();

	}

}

// 1. Animal 클래스는 메서드는 리턴값이 void 파라메터는 없으며 이름은 animalSound인 인스턴스 메서드를 갖는다.
//    메서드 내용은 The animal makes a sound 출력

// 2. Animal을 상속한 Pig는 클래스는 Animal의 매서드를 재정의하여 사용한다.
//    재정의된 매서드 내용은 the pig says : wee wee를 출력

// 3. Animal을 상속한 Dog 클래스는 Animal의 매서드를 재정의하여 사용
//    재정의된 메서드 내용은 the dog says : bow wow를 출력

// 4. main 메서드에서 상위 클래스의 객체 myPig는 하위클래스 Pig를 사용하고
//    메서드를 실행

// 5. main 메서드에서 상위 클래스의 객체 myDog은 하위클래스 Dog을 사용하고
// 	  메서드를 실행

// 6. OuterClass를 만들고 default 형 인스턴스멤버변수 int x를 정의하고 초기값을 10을 줌
//    디폴트형 인스턴스 내부 클래스 InnerClass를 만들고 int y를 정의하고 초기값 5
//    클래스형 디폴트 내부클래스 StaticInnerClass를 만들고 클래스형 멤버변수 int z를 만들고 초기값 15
//    main메서드에서 OuterClass클래스 객체 out만듬
//    내부 클래스 객체 InnerClass 객체를 만듬

// 7. 추상클래스 Animal1을 만들고 추상메서드(리턴타입 void 파라메터 없고 메서드명 amimalSound1 만듬
//    일반 메서드는 void, 파라메터 없음 (내용은 쿨쿨 출력)
//    animal1을 상속한 클래스 Pig1 클래스를 만듬(매서드 내용 마음대로)

// 8. 인터페이스 Animal2를 만듬 (메서드는 7번 메서드 2개를 사용)
//    구현한 클래스 Dog1클래스를 만듬(매서드 내용은 마음대로)
