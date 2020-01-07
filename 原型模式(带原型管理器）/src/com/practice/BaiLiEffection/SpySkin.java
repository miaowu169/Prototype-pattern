package com.practice.BaiLiEffection;
/*
 * 创建具体原型类
 */
public class SpySkin implements BaiLi {
	public Object clone() {
		SpySkin ss = null;
		try {
			ss = (SpySkin)super.clone();
			System.out.println("拷贝成功！");
		}catch(CloneNotSupportedException e) {
			System.out.println("拷贝失败！");
		}
		return ss;
	}
	
	public void display() {
		System.out.println("(百里守约)特工魅影：有谁与我约定过什么吗?");
	}
}
