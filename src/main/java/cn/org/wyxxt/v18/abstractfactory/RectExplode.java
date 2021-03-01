package cn.org.wyxxt.v18.abstractfactory;

import cn.org.wyxxt.v18.ResourceMgr;
import cn.org.wyxxt.v18.TankFrame;

import java.awt.*;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/26 6:02 下午
 * @email jsjxzw@163.com
 */
public class RectExplode extends BaseExplode {
    public static int WIDTH = ResourceMgr.explodes[0].getWidth();
    public static int HEIGHT = ResourceMgr.explodes[0].getHeight();

    private int x, y;


//    private boolean living = true;

    private TankFrame tf = null;

    private int step = 0;


    public RectExplode(int x, int y, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.tf = tf;
    }

    @Override
    public void paint(Graphics g) {

        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillRect(x, y, 10 * step, 10 * step);
        step++;
        if (step >= 5) tf.explodes.remove(this);
        g.setColor(c);

//        g.drawImage(ResourceMgr.explodes[step++], x, y, null);
//        if (step >= ResourceMgr.explodes.length) {
//            step = 0;
//            tf.explodes.remove(this);
//        }
    }
}
