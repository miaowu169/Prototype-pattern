package com.practice.protoTypeManager;

import java.util.HashMap;

import com.practice.BaiLiEffection.BaiLi;
import com.practice.BaiLiEffection.Rosefinch;
import com.practice.BaiLiEffection.SpySkin;
/*
 * 创建原型管理工具
 */
public class SkinManager {
	private HashMap<String,BaiLi> ht= new HashMap<String,BaiLi>();
	public SkinManager() {
		ht.put("SpySkin", new SpySkin());
		ht.put("Rosefinch", new Rosefinch());
	}
	
	public void addSkin(String key,BaiLi obj) {
		ht.put(key, obj);
	}
	
	public BaiLi getSkin(String key) {
		BaiLi temp = ht.get(key);
		return (BaiLi) temp.clone();
	}
}
