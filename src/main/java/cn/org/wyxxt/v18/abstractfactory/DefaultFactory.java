package cn.org.wyxxt.v18.abstractfactory;

import cn.org.wyxxt.v18.Dir;
import cn.org.wyxxt.v18.Explode;
import cn.org.wyxxt.v18.Group;
import cn.org.wyxxt.v18.TankFrame;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/26 5:47 下午
 * @email jsjxzw@163.com
 */
public class DefaultFactory extends GameFactory {
    @Override
    public BaseTank createTank(int x, int y, Dir dir, Group group, TankFrame tf) {
        return null;
    }

    @Override
    public BaseExplode createExplode(int x, int y, TankFrame tf) {
        return new Explode(x, y, tf);
    }

    @Override
    public BaseBullet createBullet(int x, int y, TankFrame tf) {
        return null;
    }
}
