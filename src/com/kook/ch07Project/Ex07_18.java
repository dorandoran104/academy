package com.kook.ch07Project;

import java.awt.*;
import java.awt.event.*;

public class Ex07_18 {

	public static void main(String[] args) {
		Button b = new Button("Strat");
		b.addActionListener(new EventHandler());
		//파라메터로 ActionListener를 구현할 객체(EventHandler)
	}

}
class EventHandler implements ActionListener{
	//ActionListener의 인터페이스를 구현할시는 추상메서드를 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred");
	}
}