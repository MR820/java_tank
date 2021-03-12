package cn.org.wyxxt.v24;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2020/12/17 3:58 下午
 * @email jsjxzw@163.com
 */
public class TankFrame extends Frame {

    GameModel gm = GameModel.getInstance();


    static final int GAME_WIDTH = 1000, GAME_HEIGHT = 600;

    public TankFrame() throws HeadlessException {

        this.setSize(GAME_WIDTH, GAME_HEIGHT);
        this.setResizable(false);
        this.setTitle("tank war");
        this.setVisible(true);

        this.addKeyListener(new MyKeyListener());

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        if (offScreenImage == null) {
            offScreenImage = this.createImage(GAME_WIDTH, GAME_HEIGHT);
        }
        Graphics graphics = offScreenImage.getGraphics();
        Color c = graphics.getColor();
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
        graphics.setColor(c);
        paint(graphics);
        g.drawImage(offScreenImage, 0, 0, null);
    }

    @Override
    public void paint(Graphics g) {
        gm.paint(g);
    }


    //Observer
    class MyKeyListener extends KeyAdapter {

        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                case KeyEvent.VK_S:
                    gm.save();
                    break;
                case KeyEvent.VK_L:
                    gm.load();
                    break;
                default:
                    break;

            }

            setMainTankDir();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                case KeyEvent.VK_CONTROL:
                    gm.getMyTank().handleFireKey();
//                    gm.getMyTank().fire();
                    break;
                default:
                    break;

            }

            setMainTankDir();
        }


        private void setMainTankDir() {
            if (!bL && !bU && !bR && !bD) {
                gm.getMyTank().setMoving(false);
            } else {
                gm.getMyTank().setMoving(true);
                if (bL) gm.getMyTank().setDir(Dir.LEFT);
                if (bU) gm.getMyTank().setDir(Dir.UP);
                if (bR) gm.getMyTank().setDir(Dir.RIGHT);
                if (bD) gm.getMyTank().setDir(Dir.DOWN);
            }
        }

    }


}
