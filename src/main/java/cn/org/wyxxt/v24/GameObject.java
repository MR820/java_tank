package cn.org.wyxxt.v24;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 2:27 下午
 * @email jsjxzw@163.com
 */

import java.awt.*;
import java.io.Serializable;

/**
 * 用抽象类还是用接口
 * ***
 * 名次 抽象类
 * 形容词 接口
 */
public abstract class GameObject implements Serializable {
    int x, y;

    public abstract void paint(Graphics g);

//    public abstract int getWidth();
//
//    public abstract int getHeight();
}
