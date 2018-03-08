package com.lml.dialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_common;
    private Button btn_version;
    private Button btn_loading;
    private Button btn_advertisement;
    private Button btn_pop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_common=(Button)findViewById(R.id.btn_common);
        btn_common.setOnClickListener(this);
        btn_version=(Button)findViewById(R.id.btn_version);
        btn_version.setOnClickListener(this);
        btn_loading=(Button)findViewById(R.id.btn_loading);
        btn_loading.setOnClickListener(this);
        btn_advertisement=(Button)findViewById(R.id.btn_advertisement);
        btn_advertisement.setOnClickListener(this);
        btn_pop=(Button)findViewById(R.id.btn_pop);
        btn_pop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_common:
                CommonDialog commonDialog=DialogManager.getInstance().getCommonDialog(this);
                commonDialog.setContentView(R.layout.common_dialog);
                commonDialog.show();
                break;
            case R.id.btn_version:
                VersionDialog versionDialog=DialogManager.getInstance().getVersionDialog(this);
                versionDialog.setContentView(R.layout.version_dialog);
                versionDialog.show();
                break;
            case R.id.btn_loading:
                LoadingDialog loadingDialog=DialogManager.getInstance().getLoadingDialog(this);
                loadingDialog.setContentView(R.layout.loading_dialog);
                loadingDialog.show();
                break;
            case R.id.btn_advertisement:
                AdvertisementDialog advertisementDialog=DialogManager.getInstance().getAdvertisementDialog(this);
                advertisementDialog.setContentView(R.layout.advertisement_dialog);
                advertisementDialog.show();
                break;
            case R.id.btn_pop:
                PopFromButtomDialog popFromBuutomDialog=DialogManager.getInstance().getPopFromButtomDialog(this,this);
                popFromBuutomDialog.setContentView(R.layout.pop_dialog);
                popFromBuutomDialog.show();
                break;
        }
    }
}
