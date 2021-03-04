package cn.org.wyxxt.v23;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/3 6:11 下午
 * @email jsjxzw@163.com
 */
public class TankFireEvent {
    Tank tank;

    public Tank getSource() {
        return tank;
    }

    public TankFireEvent(Tank tank) {
        this.tank = tank;
    }
}
