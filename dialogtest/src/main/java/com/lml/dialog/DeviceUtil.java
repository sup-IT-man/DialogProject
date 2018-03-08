package com.lml.dialog;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by lml on 2018/3/8.
 */

public class DeviceUtil {

    /**
     * 获取屏幕的宽度
     * @param activity
     * @return
     */
    public static int getDisplayWidth(Activity activity){
        Display display=activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics=new DisplayMetrics();
        display.getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /**
     * 获取屏幕的高度
     * @param activity
     * @return
     */
    public static int getDisplayHeight(Activity activity){
        Display display=activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics=new DisplayMetrics();
        display.getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
}
