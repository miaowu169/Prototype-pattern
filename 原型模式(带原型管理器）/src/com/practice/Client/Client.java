package com.practice.Client;

import com.practice.BaiLiEffection.BaiLi;
import com.practice.protoTypeManager.SkinManager;
/*
 * 创建客户类
 */
public class Client {
	public static void main(String [] args) {
		SkinManager sm = new SkinManager();
		//复制英雄百里守约特工魅影特效
		BaiLi obj1 = (BaiLi)sm.getSkin("SpySkin");
		obj1.display();
		//复制英雄百里守约朱雀志特效
		BaiLi obj2 = (BaiLi)sm.getSkin("Rosefinch");
		obj2.display();
		BaiLi obj3 = (BaiLi)sm.getSkin("SpySkin");
		obj3.display();
	}
}
