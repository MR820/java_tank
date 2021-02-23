package cn.org.wyxxt;

import org.junit.Test;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2020/12/21 2:04 下午
 * @email jsjxzw@163.com
 */
public class ImageTest {
    @Test
    public void test() {
        try {
            BufferedImage image = ImageIO.read(new File("/Users/xingzhiwei/java/tank/src/images/bulletD.gif"));
            assertNotNull(image);


            BufferedImage image2 = ImageIO.read(ImageTest.class.getClassLoader().getResourceAsStream("images/bulletD.gif"));
            assertNotNull(image2);
        } catch (IOException e) {
            System.out.println("IO error");
            e.printStackTrace();
        }

    }
}
