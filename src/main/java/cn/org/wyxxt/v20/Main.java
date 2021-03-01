package cn.org.wyxxt.v20;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2020/12/17 4:03 下午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();


        while (true) {
            Thread.sleep(50);
            tf.repaint();
        }
    }
}
