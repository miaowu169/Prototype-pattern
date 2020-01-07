package com.practice.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
 * 创建原型类
 */
public class CloneGame implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private GameInfor gameInfor = null;
	
	public CloneGame(String Player,String gameInfor,String display) {
		this.gameInfor = new GameInfor(Player,gameInfor,display);
	}
	
	public Object deepClone() throws IOException,ClassNotFoundException{
		//将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//将对象从流中取出
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		System.out.println("玩家系统复制成功！");
		return (ois.readObject());
	}
	
	public GameInfor getGameInfor() {
		return this.gameInfor;
	}
}
