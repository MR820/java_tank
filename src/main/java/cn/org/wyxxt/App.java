package cn.org.wyxxt;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {

//            BufferedImage image = ImageIO.read(new File("/Users/xingzhiwei/java/tank/src/images/bulletD.gif"));


            BufferedImage image2 = ImageIO.read(App.class.getClassLoader().getResourceAsStream("images/bulletD.gif"));

        } catch (IOException e) {
            System.out.println("IO error");
            e.printStackTrace();
        }
    }
}
