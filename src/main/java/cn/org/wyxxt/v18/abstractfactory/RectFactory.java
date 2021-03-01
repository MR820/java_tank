package cn.org.wyxxt.v18.abstractfactory;

import cn.org.wyxxt.v18.Dir;
import cn.org.wyxxt.v18.Group;
import cn.org.wyxxt.v18.TankFrame;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/26 6:05 下午
 * @email jsjxzw@163.com
 */
public class RectFactory extends GameFactory {
    @Override
    public BaseTank createTank(int x, int y, Dir dir, Group group, TankFrame tf) {
        return null;
    }

    @Override
    public BaseExplode createExplode(int x, int y, TankFrame tf) {
        return new RectExplode(x, y, tf);
    }

    @Override
    public BaseBullet createBullet(int x, int y, TankFrame tf) {
        return null;
    }
}
