package com.kook.ch07Quiz;

public interface Animal2 {
	public abstract void animalSound2();

	default void sleep2() {
		System.out.println("ÄðÄð2");
	}
	public static final int CONST = 100;
	
	public static void sta() {
		
	}
}
