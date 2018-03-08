package com.lml.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by lml on 2018/3/8.
 * 底部弹窗
 */

public class PopFromButtomDialog extends Dialog {
    private Activity activity;
    public PopFromButtomDialog(@NonNull Context context,Activity activity) {
        this(context,R.style.AnimateDialog);
        this.activity=activity;
    }

    public PopFromButtomDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
    }

    protected PopFromButtomDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 以下几行代码是给dialog设置基本的属性
         */
        //获取窗口
        Window window=getWindow();
        //获取窗口管理者的属性
        WindowManager.LayoutParams params=window.getAttributes();
        //设置当前dialog是在哪里显示
        params.gravity= Gravity.BOTTOM;
        params.width=DeviceUtil.getDisplayWidth(activity);
        window.setAttributes(params);
    }
}
