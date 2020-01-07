package com.practice.clonepattern;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * ����ԭ����
 */
public class BaiLiShouYue extends JPanel implements Cloneable {
	private static final long serialVersionUID = 1L;

	public BaiLiShouYue() {
		JLabel l1 = new JLabel(new ImageIcon("src/bailishouyue.png"));
		this.add(l1);
	}
	
	//����ԭ�Ͷ���
	public Object clone() {
		BaiLiShouYue blsy = null;
		try {
			blsy = (BaiLiShouYue)super.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("����������Լʧ�ܣ�");
		}
		return blsy;
	}
}

