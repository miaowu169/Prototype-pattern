package com.practice.BaiLiEffection;
/*
 * ��������ԭ����
 */
public class SpySkin implements BaiLi {
	public Object clone() {
		SpySkin ss = null;
		try {
			ss = (SpySkin)super.clone();
			System.out.println("�����ɹ���");
		}catch(CloneNotSupportedException e) {
			System.out.println("����ʧ�ܣ�");
		}
		return ss;
	}
	
	public void display() {
		System.out.println("(������Լ)�ع���Ӱ����˭����Լ����ʲô��?");
	}
}
