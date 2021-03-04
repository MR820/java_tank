package cn.org.wyxxt.v23.cor;

import cn.org.wyxxt.v23.Bullet;
import cn.org.wyxxt.v23.Explode;
import cn.org.wyxxt.v23.GameObject;
import cn.org.wyxxt.v23.Tank;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 3:00 下午
 * @email jsjxzw@163.com
 */
public class BulletTankCollider implements Collider {
    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if (o1 instanceof Bullet && o2 instanceof Tank) {
            Bullet b = (Bullet) o1;
            Tank t = (Tank) o2;

            if (b.getGroup() == t.getGroup()) return true;
//        //todo 用一个rect来记录子弹的位置
//        Rectangle rect1 = new Rectangle(this.x,this.y,WIDTH,HEIGHT);
//        Rectangle rect2 = new Rectangle(tank.getX(),tank.getY(), Tank.WIDTH, Tank.HEIGHT);
            if (b.getRect().intersects(t.getRect())) {
                t.die();
                b.die();
                int eX = t.getX() + Tank.WIDTH / 2 - Explode.WIDTH / 2;
                int eY = t.getY() + Tank.HEIGHT / 2 - Explode.HEIGHT / 2;
                new Explode(eX, eY);
                return false;
            }
            return true;
        } else if (o1 instanceof Tank && o2 instanceof Bullet) {
            collide(o2, o1);
        }
        return true;
    }
}
