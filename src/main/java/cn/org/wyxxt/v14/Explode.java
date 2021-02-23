package cn.org.wyxxt.v14;

import java.awt.*;

/**
 * 子弹类
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2020/12/18 2:31 下午
 * @email jsjxzw@163.com
 */
public class Explode {

    public static int WIDTH= ResourceMgr.explodes[0].getWidth();
    public static int HEIGHT= ResourceMgr.explodes[0].getHeight();

    private int x,y;


//    private boolean living = true;

    private TankFrame tf = null;

    private int step = 0;


    public Explode(int x, int y, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.tf = tf;
    }

    public void paint(Graphics g) {
        g.drawImage(ResourceMgr.explodes[step++],x,y,null);
        if (step >= ResourceMgr.explodes.length) {
            step = 0;
            tf.explodes.remove(this);
        }
    }

}
