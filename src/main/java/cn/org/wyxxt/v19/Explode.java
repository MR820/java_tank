package cn.org.wyxxt.v19;

import java.awt.*;

/**
 * 爆炸类
 *
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2020/12/18 2:31 下午
 * @email jsjxzw@163.com
 */
public class Explode {

    public static int WIDTH = ResourceMgr.explodes[0].getWidth();
    public static int HEIGHT = ResourceMgr.explodes[0].getHeight();

    private int x, y;


//    private boolean living = true;

    private GameModel gm = null;

    private int step = 0;


    public Explode(int x, int y, GameModel gm) {
        this.x = x;
        this.y = y;
        this.gm = gm;
    }

    public void paint(Graphics g) {
        g.drawImage(ResourceMgr.explodes[step++], x, y, null);
        if (step >= ResourceMgr.explodes.length) {
            step = 0;
            gm.explodes.remove(this);
        }
    }

}
