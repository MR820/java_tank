package cn.org.wyxxt.v22.decorator;

import cn.org.wyxxt.v22.GameObject;

import java.awt.*;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 7:22 下午
 * @email jsjxzw@163.com
 */
public class TailDecorator extends GODecorator {
    public TailDecorator(GameObject go) {
        super(go);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Color c = g.getColor();
        g.setColor(Color.WHITE);
        g.drawLine(super.go.getX(), super.go.getY(), super.go.getX() + super.go.getWidth(), super.go.getY() + super.go.getHeight());
        g.setColor(c);

    }

    @Override
    public int getWidth() {
        return super.go.getWidth();
    }

    @Override
    public int getHeight() {
        return super.go.getHeight();
    }

    @Override
    public int getX() {
        return super.go.getX();
    }

    @Override
    public int getY() {
        return super.go.getY();
    }


}
