package com.kook.ch07Project;

import java.awt.*;
import java.awt.event.*;

//익명의 클래스로 GUI의 이벤트 처리
public class Ex07_19 {

	public static void main(String[] args) {
		Frame frame = new Frame("Title!");
		frame.setSize(500, 300);
		frame.setVisible(true);

		Button b = new Button("Start");
		frame.add(b);

		

		// addActionListener메서드의 파라메터는 인터페이스 ActionListener 구현 객체
		// 익명의 클래스로 객체를 구현
		// 인터페이스 객체를 new생성자로 만들고 인터페이스의 추상메서드를 구현해줘야한다

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred");
			}
		});
		/* 익명의 클래스는 보통 new 인터페이스(추상클래스)생성자(){}; 인터페이스나
		 * 		인터페이스(추상클래스)의 추상메서드를 구현
		 * 		필요한 코드 작성
		 */
		System.exit(1);
	}

}
