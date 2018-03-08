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
 */

public class CommonDialog extends Dialog {
    private Context context;

    public CommonDialog(@NonNull Context context) {
        this(context,R.style.MyDialog);
        this.context=context;
    }

    public CommonDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        this.context=context;
    }

    protected CommonDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context=context;
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
        params.x=0;
        params.y=100;
        params.gravity= Gravity.LEFT|Gravity.TOP;
        window.setAttributes(params);
    }
}
