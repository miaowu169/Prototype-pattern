package com.practice.clone;

import java.io.Serializable;
/*
 * 创建成员对象类
 */
public class GameInfor implements Serializable {
	private static final long serialVersionUID = 1L;
	String player;
	String infor;
	String display;
	
	public GameInfor(String _player,String _infor,String _display) {
		this.player = _player;
		this.infor = _infor;
		this.display = _display;
		System.out.println("玩家系统创建成功！");
	}

	public GameInfor() {}

	public void setPlayer(String player) {
		this.player = player;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	
	public void Introduce() {
		System.out.println(player + infor + display);
	}
}
