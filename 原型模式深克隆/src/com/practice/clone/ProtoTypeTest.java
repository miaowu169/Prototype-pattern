package com.practice.clone;

import java.io.IOException;
/*
 * 创建测试类
 */
public class ProtoTypeTest {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException{
		CloneGame obj1 = new CloneGame("妙乌:","(百里守约)技能以狙击为主，在对抗赛有着很强的远程优势。","给我一个目标，还你一片寂静");
		GameInfor gif = obj1.getGameInfor();
		gif.Introduce();
		CloneGame obj2 = (CloneGame)obj1.deepClone();
		GameInfor gif1 = obj2.getGameInfor();
		gif1.setPlayer("秋梨膏：");
		gif1.setDisplay("准备篝火旁的晚餐，庆祝又活过一天");
		gif1.Introduce();
	}
}
