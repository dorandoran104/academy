package com.kook.ch07Project;

import java.awt.*;
import java.awt.event.*;

//�͸��� Ŭ������ GUI�� �̺�Ʈ ó��
public class Ex07_19 {

	public static void main(String[] args) {
		Frame frame = new Frame("Title!");
		frame.setSize(500, 300);
		frame.setVisible(true);

		Button b = new Button("Start");
		frame.add(b);

		

		// addActionListener�޼����� �Ķ���ʹ� �������̽� ActionListener ���� ��ü
		// �͸��� Ŭ������ ��ü�� ����
		// �������̽� ��ü�� new�����ڷ� ����� �������̽��� �߻�޼��带 ����������Ѵ�

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred");
			}
		});
		/* �͸��� Ŭ������ ���� new �������̽�(�߻�Ŭ����)������(){}; �������̽���
		 * 		�������̽�(�߻�Ŭ����)�� �߻�޼��带 ����
		 * 		�ʿ��� �ڵ� �ۼ�
		 */
		System.exit(1);
	}

}
