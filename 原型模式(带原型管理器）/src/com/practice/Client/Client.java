package com.practice.Client;

import com.practice.BaiLiEffection.BaiLi;
import com.practice.protoTypeManager.SkinManager;
/*
 * �����ͻ���
 */
public class Client {
	public static void main(String [] args) {
		SkinManager sm = new SkinManager();
		//����Ӣ�۰�����Լ�ع���Ӱ��Ч
		BaiLi obj1 = (BaiLi)sm.getSkin("SpySkin");
		obj1.display();
		//����Ӣ�۰�����Լ��ȸ־��Ч
		BaiLi obj2 = (BaiLi)sm.getSkin("Rosefinch");
		obj2.display();
		BaiLi obj3 = (BaiLi)sm.getSkin("SpySkin");
		obj3.display();
	}
}
