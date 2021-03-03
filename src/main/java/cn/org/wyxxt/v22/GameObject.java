package cn.org.wyxxt.v22;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 2:27 下午
 * @email jsjxzw@163.com
 */

import java.awt.*;

/**
 * 用抽象类还是用接口
 * ***
 * 名词 抽象类
 * 形容词 接口
 */
public abstract class GameObject {
    protected int x, y;


    public abstract void paint(Graphics g);

    public abstract int getWidth();

    public abstract int getHeight();

    public abstract int getX();

    public abstract int getY();
}
