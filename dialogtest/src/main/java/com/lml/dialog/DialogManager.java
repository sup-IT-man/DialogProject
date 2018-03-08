package com.lml.dialog;

import android.app.Activity;
import android.content.Context;

/**
 * Created by lml on 2018/3/8.
 * Dialog管理者
 */

public class DialogManager {

    private static final DialogManager instance=new DialogManager();

    private DialogManager(){
    }

    public static DialogManager getInstance(){
        return instance;
    }

    /**
     * 获取简单的dialog
     * @param context
     * @return
     */
    public CommonDialog getCommonDialog(Context context){
        CommonDialog commonDialog=new CommonDialog(context);
        return commonDialog;
    }

    /**
     * 版本升级的用的Dialog
     * @param context
     * @return
     */
    public VersionDialog getVersionDialog(Context context){
        VersionDialog versionDialog=new VersionDialog(context);
        return versionDialog;
    }

    /**
     * 正在加载的dialog
     * @param context
     * @return
     */
    public LoadingDialog getLoadingDialog(Context context){
        LoadingDialog loadingDialog=new LoadingDialog(context);
        return loadingDialog;
    }

    /**
     * 加载广告的dialog
     * @param context
     * @return
     */
    public AdvertisementDialog getAdvertisementDialog(Context context){
        AdvertisementDialog advertisementDialog=new AdvertisementDialog(context);
        return advertisementDialog;
    }

    /**
     * 底部弹窗dialog
     * @param context
     * @return
     */
    public PopFromButtomDialog getPopFromButtomDialog(Context context, Activity activity){
        PopFromButtomDialog popFromButtomDialog=new PopFromButtomDialog(context,activity);
        return popFromButtomDialog;
    }
}
