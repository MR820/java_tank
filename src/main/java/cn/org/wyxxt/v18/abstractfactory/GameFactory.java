package cn.org.wyxxt.v18.abstractfactory;

import cn.org.wyxxt.v18.Dir;
import cn.org.wyxxt.v18.Group;
import cn.org.wyxxt.v18.TankFrame;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/26 5:40 下午
 * @email jsjxzw@163.com
 */
public abstract class GameFactory {
    public abstract BaseTank createTank(int x, int y, Dir dir, Group group, TankFrame tf);

    public abstract BaseExplode createExplode(int x, int y, TankFrame tf);

    public abstract BaseBullet createBullet(int x, int y, TankFrame tf);
}
