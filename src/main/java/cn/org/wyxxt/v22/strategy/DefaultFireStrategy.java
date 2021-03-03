package cn.org.wyxxt.v22.strategy;

import cn.org.wyxxt.v22.Bullet;
import cn.org.wyxxt.v22.GameModel;
import cn.org.wyxxt.v22.Tank;
import cn.org.wyxxt.v22.decorator.RectDecorator;
import cn.org.wyxxt.v22.decorator.TailDecorator;

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

        GameModel.getInstance().add(
                new RectDecorator(
                        new TailDecorator(
                                new Bullet(bX, bY, t.getDir(), t.getGroup()))));
    }
}
