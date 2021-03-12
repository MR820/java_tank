package cn.org.wyxxt.v24.cor;

import cn.org.wyxxt.v24.GameObject;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 2:56 下午
 * @email jsjxzw@163.com
 */
public interface Collider {
    boolean collide(GameObject o1, GameObject o2);
}
