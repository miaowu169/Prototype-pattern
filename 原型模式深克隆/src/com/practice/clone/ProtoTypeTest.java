package com.practice.clone;

import java.io.IOException;
/*
 * ����������
 */
public class ProtoTypeTest {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException{
		CloneGame obj1 = new CloneGame("����:","(������Լ)�����Ծѻ�Ϊ�����ڶԿ������ź�ǿ��Զ�����ơ�","����һ��Ŀ�꣬����һƬ�ž�");
		GameInfor gif = obj1.getGameInfor();
		gif.Introduce();
		CloneGame obj2 = (CloneGame)obj1.deepClone();
		GameInfor gif1 = obj2.getGameInfor();
		gif1.setPlayer("����ࣺ");
		gif1.setDisplay("׼�������Ե���ͣ���ף�ֻ��һ��");
		gif1.Introduce();
	}
}
