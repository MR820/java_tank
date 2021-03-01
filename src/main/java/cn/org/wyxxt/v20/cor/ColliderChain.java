package cn.org.wyxxt.v20.cor;

import cn.org.wyxxt.v20.GameObject;
import cn.org.wyxxt.v20.PropertyMgr;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 3:41 下午
 * @email jsjxzw@163.com
 */
public class ColliderChain implements Collider {
    private List<Collider> colliders = new LinkedList<>();

    public ColliderChain() {
//        add(new BulletTankCollider());
//        add(new TankTankCollider());
        String colliders = (String) PropertyMgr.get("colliders");
        String[] tmp = colliders.split(",");
        for (int i = 0; i < tmp.length; i++) {
            try {
                add((Collider) Class.forName(tmp[i]).getDeclaredConstructor().newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void add(Collider c) {
        colliders.add(c);
    }

    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        for (int i = 0; i < colliders.size(); i++) {
            if (!colliders.get(i).collide(o1, o2)) {
                return false;
            }
        }
        return true;
    }
}
