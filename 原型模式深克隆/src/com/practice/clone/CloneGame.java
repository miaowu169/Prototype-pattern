package com.practice.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
 * ����ԭ����
 */
public class CloneGame implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private GameInfor gameInfor = null;
	
	public CloneGame(String Player,String gameInfor,String display) {
		this.gameInfor = new GameInfor(Player,gameInfor,display);
	}
	
	public Object deepClone() throws IOException,ClassNotFoundException{
		//������д������
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//�����������ȡ��
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		System.out.println("���ϵͳ���Ƴɹ���");
		return (ois.readObject());
	}
	
	public GameInfor getGameInfor() {
		return this.gameInfor;
	}
}
