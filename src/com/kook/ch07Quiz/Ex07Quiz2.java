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

// 1. Animal Ŭ������ �޼���� ���ϰ��� void �Ķ���ʹ� ������ �̸��� animalSound�� �ν��Ͻ� �޼��带 ���´�.
//    �޼��� ������ The animal makes a sound ���

// 2. Animal�� ����� Pig�� Ŭ������ Animal�� �ż��带 �������Ͽ� ����Ѵ�.
//    �����ǵ� �ż��� ������ the pig says : wee wee�� ���

// 3. Animal�� ����� Dog Ŭ������ Animal�� �ż��带 �������Ͽ� ���
//    �����ǵ� �޼��� ������ the dog says : bow wow�� ���

// 4. main �޼��忡�� ���� Ŭ������ ��ü myPig�� ����Ŭ���� Pig�� ����ϰ�
//    �޼��带 ����

// 5. main �޼��忡�� ���� Ŭ������ ��ü myDog�� ����Ŭ���� Dog�� ����ϰ�
// 	  �޼��带 ����

// 6. OuterClass�� ����� default �� �ν��Ͻ�������� int x�� �����ϰ� �ʱⰪ�� 10�� ��
//    ����Ʈ�� �ν��Ͻ� ���� Ŭ���� InnerClass�� ����� int y�� �����ϰ� �ʱⰪ 5
//    Ŭ������ ����Ʈ ����Ŭ���� StaticInnerClass�� ����� Ŭ������ ������� int z�� ����� �ʱⰪ 15
//    main�޼��忡�� OuterClassŬ���� ��ü out����
//    ���� Ŭ���� ��ü InnerClass ��ü�� ����

// 7. �߻�Ŭ���� Animal1�� ����� �߻�޼���(����Ÿ�� void �Ķ���� ���� �޼���� amimalSound1 ����
//    �Ϲ� �޼���� void, �Ķ���� ���� (������ ���� ���)
//    animal1�� ����� Ŭ���� Pig1 Ŭ������ ����(�ż��� ���� �������)

// 8. �������̽� Animal2�� ���� (�޼���� 7�� �޼��� 2���� ���)
//    ������ Ŭ���� Dog1Ŭ������ ����(�ż��� ������ �������)
