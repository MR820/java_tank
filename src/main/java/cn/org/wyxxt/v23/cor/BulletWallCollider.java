package cn.org.wyxxt.v23.cor;

import cn.org.wyxxt.v23.Bullet;
import cn.org.wyxxt.v23.GameObject;
import cn.org.wyxxt.v23.Wall;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 3:00 下午
 * @email jsjxzw@163.com
 */
public class BulletWallCollider implements Collider {
    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if (o1 instanceof Bullet && o2 instanceof Wall) {
            Bullet b = (Bullet) o1;
            Wall w = (Wall) o2;

            if (b.getRect().intersects(w.getRect())) {
                b.die();
            }
        } else if (o1 instanceof Wall && o2 instanceof Bullet) {
            collide(o2, o1);
        }
        return true;
    }
}