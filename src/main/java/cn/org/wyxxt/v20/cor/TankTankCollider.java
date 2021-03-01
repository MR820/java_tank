package cn.org.wyxxt.v20.cor;

import cn.org.wyxxt.v20.GameObject;
import cn.org.wyxxt.v20.Tank;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 3:15 下午
 * @email jsjxzw@163.com
 */
public class TankTankCollider implements Collider {
    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if (o1 instanceof Tank && o2 instanceof Tank) {
            Tank t1 = (Tank) o1;
            Tank t2 = (Tank) o2;

            if (t1.getRect().intersects(t2.getRect())) {
                t1.stop();
                t2.stop();
            }

        }
        return true;
    }
}
