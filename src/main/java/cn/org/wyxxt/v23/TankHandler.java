package cn.org.wyxxt.v23;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/4 1:40 下午
 * @email jsjxzw@163.com
 */
public class TankHandler implements TankFireObserver {


    @Override
    public void actionOnFire(TankFireEvent e) {
        Tank t = e.getSource();
        t.fire();
    }
}
