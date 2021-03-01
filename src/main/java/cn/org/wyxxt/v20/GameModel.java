package cn.org.wyxxt.v20;

import cn.org.wyxxt.v20.cor.ColliderChain;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 11:35 上午
 * @email jsjxzw@163.com
 */
public class GameModel {

    Tank myTank = new Tank(200, 300, Dir.DOWN, Group.GOOD, this);


//    List<Bullet> bullets = new ArrayList<>();
//    List<Tank> tanks = new ArrayList<>();
//    List<Explode> explodes = new ArrayList<>();

    ColliderChain chain = new ColliderChain();

    private List<GameObject> objects = new ArrayList<>();


    public GameModel() {
        add(myTank);

        int initTankCount = Integer.parseInt((String) PropertyMgr.get("initTankCount"));

        //初始化敌方坦克
        for (int i = 0; i < initTankCount; i++) {
            add(new Tank(50 + i * 80, 200, Dir.DOWN, Group.BAD, this));
        }
    }

    public void add(GameObject go) {
        this.objects.add(go);
    }

    public void remove(GameObject go) {
        this.objects.remove(go);
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.WHITE);
//        g.drawString("子弹的数量" + bullets.size(), 10, 60);
//        g.drawString("敌人的数量" + tanks.size(), 10, 80);
//        g.drawString("爆炸的数量" + explodes.size(), 10, 100);
        g.setColor(c);

//        myTank.paint(g);
        /**
         * 迭代器不允许外部删除
         */
//        for (Bullet b : bullets) {
//            b.paint(g);
//        }
        for (int i = 0; i < objects.size(); i++) {
            objects.get(i).paint(g);
        }

        for (int i = 0; i < objects.size(); i++) {
            for (int j = i + 1; j < objects.size(); j++) { //Comparator.compare(o1,o2)
                GameObject o1 = objects.get(i);
                GameObject o2 = objects.get(j);
                //for
                chain.collide(o1, o2);
            }
        }

//        for (int i = 0; i < bullets.size(); i++) {
//            for (int j = 0; j < tanks.size(); j++) {
//                //碰撞检测
//                bullets.get(i).collideWith(tanks.get(j));
//            }
//        }

    }

    public Tank getMyTank() {
        return myTank;
    }
}
