package cn.org.wyxxt.v14;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2020/12/17 4:03 下午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();

        //初始化敌方坦克
        for (int i=0;i<5;i++) {
            tankFrame.tanks.add(new Tank(50+i*80,200, Dir.DOWN, Group.BAD,tankFrame));
        }

        while (true) {
            Thread.sleep(50);
            tankFrame.repaint();
        }
    }
}
