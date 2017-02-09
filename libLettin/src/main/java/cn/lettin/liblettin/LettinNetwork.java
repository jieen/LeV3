package cn.lettin.liblettin;

/**
 * 项目名称: Lettin3
 * 创建人员: jieen
 * 创建时间: 17-2-9 下午4:15.
 */

public class LettinNetwork{

    static {
        System.loadLibrary("lettinnet");
    }

    public native String stringFromJNI();

    public native int getGwVersion();

}
