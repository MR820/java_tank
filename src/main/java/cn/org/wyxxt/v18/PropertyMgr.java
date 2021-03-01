package cn.org.wyxxt.v18;

import java.io.IOException;
import java.util.Properties;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/23 10:19 上午
 * @email jsjxzw@163.com
 */
public class PropertyMgr {
    static Properties props = new Properties();

    static {
        try {
            props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private PropertyMgr() {
    }

    //int getInt(key)
    //getString(key)


    public static Object get(String key) {
        if (props == null) return null;
        return props.get(key);
    }

    public static void main(String[] args) {
        System.out.println(PropertyMgr.get("initTankCount"));
    }
}
