package com.practice.clonepattern;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
/*
 * ����������
 */
public class ProtoTypeBaiLi {
	public static void main(String[] args) {
		JFrame f = new JFrame("ԭ��ģʽ����");
		f.setLayout(new GridLayout(1,2));
		Container contentPane = f.getContentPane();
		BaiLiShouYue obj1 = new BaiLiShouYue();
		contentPane.add(obj1);
		BaiLiShouYue obj2 = (BaiLiShouYue)obj1.clone();
		contentPane.add(obj2);
		//����
		System.out.println("obj1 == obj2?");
		System.out.println(obj1 == obj2);

		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
