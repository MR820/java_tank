package cn.org.wyxxt.v24;

import cn.org.wyxxt.v24.cor.ColliderChain;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 11:35 上午
 * @email jsjxzw@163.com
 */
public class GameModel {

    private static final GameModel INSTANCE = new GameModel();

    static {
        INSTANCE.init();
    }

    Tank myTank;

    public static GameModel getInstance() {
        return INSTANCE;
    }

//    List<Bullet> bullets = new ArrayList<>();
//    List<Tank> tanks = new ArrayList<>();
//    List<Explode> explodes = new ArrayList<>();

    ColliderChain chain = new ColliderChain();

    private List<GameObject> objects = new ArrayList<>();

    //Mediator模式 -》协调者模式，对内   Facade模式 -》 门面模式，对外

    private GameModel() {

    }

    private void init() {
        //初始化主战坦克
        myTank = new Tank(200, 300, Dir.DOWN, Group.GOOD);
        //初始化墙
        new Wall(150, 150, 200, 50);
        new Wall(550, 150, 200, 50);
        new Wall(300, 300, 50, 200);
        new Wall(550, 300, 50, 200);
        int initTankCount = Integer.parseInt((String) PropertyMgr.get("initTankCount"));
        //初始化敌方坦克
        for (int i = 0; i < initTankCount; i++) {
            new Tank(50 + i * 80, 200, Dir.DOWN, Group.BAD);
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


    }

    public Tank getMyTank() {
        return myTank;
    }

    public void save() {
        File f = new File("/Users/xingzhiwei/java/tank/tank.data");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(myTank);
            oos.writeObject(objects);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void load() {
        File f = new File("/Users/xingzhiwei/java/tank/tank.data");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(f));
            myTank = (Tank) ois.readObject();
            objects = (List) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
