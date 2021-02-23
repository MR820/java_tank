package cn.org.wyxxt.v3;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2020/12/17 4:03 下午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();
        while (true) {
            Thread.sleep(50);
            tankFrame.repaint();
        }
    }
}
