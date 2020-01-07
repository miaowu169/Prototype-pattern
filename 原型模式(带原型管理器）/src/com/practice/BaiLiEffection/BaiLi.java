package com.practice.BaiLiEffection;
/*
 * 创建抽象原型类
 */
public interface BaiLi extends Cloneable {
    public Object clone();    //拷贝
    public void display();    //计算面积
}
