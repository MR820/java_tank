package cn.org.wyxxt.v19;

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

    List<Bullet> bullets = new ArrayList<>();
    List<Tank> tanks = new ArrayList<>();
    List<Explode> explodes = new ArrayList<>();

    public GameModel() {
        int initTankCount = Integer.parseInt((String) PropertyMgr.get("initTankCount"));

        //初始化敌方坦克
        for (int i = 0; i < initTankCount; i++) {
            tanks.add(new Tank(50 + i * 80, 200, Dir.DOWN, Group.BAD, this));
        }
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.WHITE);
        g.drawString("子弹的数量" + bullets.size(), 10, 60);
        g.drawString("敌人的数量" + tanks.size(), 10, 80);
        g.drawString("爆炸的数量" + explodes.size(), 10, 100);
        g.setColor(c);

        myTank.paint(g);
        /**
         * 迭代器不允许外部删除
         */
//        for (Bullet b : bullets) {
//            b.paint(g);
//        }
        for (int i = 0; i < bullets.size(); i++) {
            bullets.get(i).paint(g);
        }
        for (int i = 0; i < tanks.size(); i++) {
            tanks.get(i).paint(g);
        }
        for (int i = 0; i < bullets.size(); i++) {
            for (int j = 0; j < tanks.size(); j++) {
                //碰撞检测
                bullets.get(i).collideWith(tanks.get(j));
            }
        }
        for (int i = 0; i < explodes.size(); i++) {
            explodes.get(i).paint(g);
        }
    }

    public Tank getMyTank() {
        return myTank;
    }
}
