package cn.org.wyxxt.v21.strategy;

import cn.org.wyxxt.v21.Bullet;
import cn.org.wyxxt.v21.Tank;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/24 10:38 上午
 * @email jsjxzw@163.com
 */
public class DefaultFireStrategy implements FireStrategy {
    @Override
    public void fire(Tank t) {
        int bX = t.x + Tank.WIDTH / 2 - Bullet.WIDTH / 2;
        int bY = t.y + Tank.HEIGHT / 2 - Bullet.HEIGHT / 2;
        new Bullet(bX, bY, t.getDir(), t.getGroup());
    }
}
