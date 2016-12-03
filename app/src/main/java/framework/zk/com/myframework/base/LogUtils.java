package framework.zk.com.myframework.base;

import android.util.Log;

import com.orhanobut.logger.Logger;

import static android.R.attr.tag;

/**
 * author: ZK.
 * date:   On 2016/12/3
 */

public class LogUtils {

    private static final boolean isOpen = true;


    public static void d(Object object) {
        if (isOpen)
            Logger.d(object);
    }

    public static void d(String tag, Object object) {
        if (isOpen)
            Logger.d(tag, object);
    }

    public static void e(Throwable throwable, String tag, Object object) {
        if (isOpen)
            Logger.e(throwable, tag, object);
    }

    public static void e(String tag, Object object) {
        if (isOpen)
            Logger.e(tag, object);
    }


    public static void w(String tag, Object object) {
        if (isOpen)
            Logger.w(tag, object);
    }

    public static void i(String tag, Object object) {
        if (isOpen)
            Logger.i(tag, object);
    }


}
