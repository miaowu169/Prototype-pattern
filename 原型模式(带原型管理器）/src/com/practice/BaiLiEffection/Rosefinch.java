package com.practice.BaiLiEffection;
/*
 * 创建具体原型类
 */
public class Rosefinch implements BaiLi {
	public Object clone() {
		Rosefinch rf = null;
		try {
			rf = (Rosefinch)super.clone();
			System.out.println("拷贝成功！");
		}catch(CloneNotSupportedException e) {
			System.out.println("拷贝失败！");
		}
		return rf;
	}
	
	public void display() {
		System.out.println("(百里守约)朱雀志：子弹上膛的声音，是我唱歌的先兆");
	}
}
