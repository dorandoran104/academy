package com.kook.ch07Project;

public class Ex07_14 {
	// ��� ����
	private int outerIv = 0;
	static int outerCv = 0;

	// ���������ڰ� �����Ƿ� default, �� ��Ű�� �ȿ��� ��𼭳� ��� ����
	class InstanceInner {
		// �ν��Ͻ��� ���� Ŭ������ �θ� Ŭ������ ��� �̹Ƿ� �ٸ� ��� ��� ����
		int iiv = outerIv;
		int iiv2 = outerCv;

	}

	static class StaticInner {
		// Ŭ������ ���� Ŭ������
		// static�� static����� �״�� ����ϳ� �ν��Ͻ������ �ܺΰ�ü�� ����� ���
		// int siv = ex07.outerIv; ��ü�� ������ ��� ����
		static int scv = outerCv;

	}
	
	void myMethod() {
		int lv = 0;//�޼����� ������ ��Į ����
		final int LV = 0;//�޼����� ������ ��Į �����ε� LocalŬ�������� ������� final ���(�ڹٿ��� ���� ����)
		
		class LocalInner{
			//�ܺ�Ŭ���� ����� ��� ��� ����(Ŭ������ �ν��Ͻ� �ٷ� ����)
			int liv = outerIv;
			int liv2 = outerCv;
			//������ �ڹ� 8�������� final�� ���� ���������� ��밡��������
			//������ final ����
			//lv = 4 �� final�� �����Ȱ��̹Ƿ� ��� �Ұ���
			int liv3 = lv;
			int liv4 = LV;
		}
	}

	public static void main(String[] args) {
		Ex07_14 ex07 = new Ex07_14();
		InstanceInner ex07In = ex07.new InstanceInner();
	
	}
}
