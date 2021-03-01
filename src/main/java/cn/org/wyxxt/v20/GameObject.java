package cn.org.wyxxt.v20;

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
 * 名次 抽象类
 * 形容词 接口
 */
public abstract class GameObject {
    int x, y;

    public abstract void paint(Graphics g);
}
