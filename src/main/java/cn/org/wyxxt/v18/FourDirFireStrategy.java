package cn.org.wyxxt.v18;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/24 10:47 上午
 * @email jsjxzw@163.com
 */
public class FourDirFireStrategy implements FireStrategy {
    @Override
    public void fire(Tank t) {
        int bX = t.x + Tank.WIDTH / 2 - Bullet.WIDTH / 2;
        int bY = t.y + Tank.HEIGHT / 2 - Bullet.HEIGHT / 2;

        Dir[] dirs = Dir.values();
        for (Dir dir : dirs) {
            new Bullet(bX, bY, dir, t.group, t.tf);
        }

    }
}
