package cn.org.wyxxt.v16;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2020/12/17 4:03 下午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();

        int initTankCount = Integer.parseInt((String)PropertyMgr.get("initTankCount"));

        //初始化敌方坦克
        for (int i=0;i<initTankCount;i++) {
            tankFrame.tanks.add(new Tank(50+i*80,200, Dir.DOWN, Group.BAD,tankFrame));
        }

        while (true) {
            Thread.sleep(50);
            tankFrame.repaint();
        }
    }
}
