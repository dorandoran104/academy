package com.kook.ch07Project;

import java.awt.*;
import java.awt.event.*;

public class Ex07_18 {

	public static void main(String[] args) {
		Button b = new Button("Strat");
		b.addActionListener(new EventHandler());
		//�Ķ���ͷ� ActionListener�� ������ ��ü(EventHandler)
	}

}
class EventHandler implements ActionListener{
	//ActionListener�� �������̽��� �����ҽô� �߻�޼��带 ����
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred");
	}
}