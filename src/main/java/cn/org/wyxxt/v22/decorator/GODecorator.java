package cn.org.wyxxt.v22.decorator;

import cn.org.wyxxt.v22.GameObject;

import java.awt.*;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 7:21 下午
 * @email jsjxzw@163.com
 */
public abstract class GODecorator extends GameObject {

    GameObject go;

    public GODecorator(GameObject go) {
        this.go = go;
    }

    @Override
    public void paint(Graphics g) {
        go.paint(g);
    }


}
