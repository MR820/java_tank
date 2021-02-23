package cn.org.wyxxt.v2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2020/12/17 3:58 下午
 * @email jsjxzw@163.com
 */
public class TankFrame extends Frame {
    public TankFrame() throws HeadlessException {
        this.setSize(800,600);
        this.setResizable(false);
        this.setTitle("tank war");
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(200,200,50,50);
    }
}
