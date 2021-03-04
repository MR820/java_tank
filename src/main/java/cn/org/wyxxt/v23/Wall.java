package cn.org.wyxxt.v23;

import java.awt.*;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 5:07 下午
 * @email jsjxzw@163.com
 */
public class Wall extends GameObject {
    int w, h;

    Rectangle rect;

    public Wall(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.rect = new Rectangle(x, y, w, h);

        GameModel.getInstance().add(this);
    }

    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }

    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.DARK_GRAY);
        g.fillRect(this.x, this.y, this.w, this.h);
        g.setColor(c);
    }
}
