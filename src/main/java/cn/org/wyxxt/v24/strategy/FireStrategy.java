package cn.org.wyxxt.v24.strategy;

import cn.org.wyxxt.v24.Tank;

import java.io.Serializable;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/24 10:37 上午
 * @email jsjxzw@163.com
 */
public interface FireStrategy extends Serializable {
    void fire(Tank t);
}
