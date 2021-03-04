package cn.org.wyxxt.v23.cor;

import cn.org.wyxxt.v23.GameObject;
import cn.org.wyxxt.v23.Tank;
import cn.org.wyxxt.v23.Wall;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 3:15 下午
 * @email jsjxzw@163.com
 */
public class TankWallCollider implements Collider {
    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if (o1 instanceof Tank && o2 instanceof Wall) {
            Tank t = (Tank) o1;
            Wall w = (Wall) o2;

            if (t.getRect().intersects(w.getRect())) {
                t.back();
            }

        } else if (o1 instanceof Wall && o2 instanceof Tank) {
            collide(o2, o1);
        }
        return true;
    }
}
