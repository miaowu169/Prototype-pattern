package com.practice.BaiLiEffection;
/*
 * ��������ԭ����
 */
public class Rosefinch implements BaiLi {
	public Object clone() {
		Rosefinch rf = null;
		try {
			rf = (Rosefinch)super.clone();
			System.out.println("�����ɹ���");
		}catch(CloneNotSupportedException e) {
			System.out.println("����ʧ�ܣ�");
		}
		return rf;
	}
	
	public void display() {
		System.out.println("(������Լ)��ȸ־���ӵ����ŵ����������ҳ��������");
	}
}
