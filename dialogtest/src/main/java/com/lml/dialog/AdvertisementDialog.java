package com.lml.dialog;

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
 * 加载广告的dialog
 */

public class AdvertisementDialog extends Dialog {
    public AdvertisementDialog(@NonNull Context context) {
        this(context,R.style.MyDialog);
    }

    public AdvertisementDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
    }

    protected AdvertisementDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
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
        params.gravity= Gravity.CENTER;
        window.setAttributes(params);
    }
}
