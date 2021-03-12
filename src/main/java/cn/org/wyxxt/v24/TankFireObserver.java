package cn.org.wyxxt.v24;

import java.io.Serializable;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/4 1:41 下午
 * @email jsjxzw@163.com
 */
public interface TankFireObserver extends Serializable {

    void actionOnFire(TankFireEvent e);
}
