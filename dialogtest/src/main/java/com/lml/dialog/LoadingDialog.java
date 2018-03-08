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
 * 加载的dialog
 */

public class LoadingDialog extends Dialog {
    public LoadingDialog(@NonNull Context context) {
        this(context,R.style.LoadDialog);
    }

    public LoadingDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
    }

    protected LoadingDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
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
        params.gravity= Gravity.CENTER;
        window.setAttributes(params);
    }
}
