package com.snxun.replugindemo;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.lodz.android.core.utils.ToastUtils;
import com.qihoo360.replugin.RePlugin;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startScan(View view) {
//        Intent intent = RePlugin.createIntent("idcard", "com.kernal.passportreader.sdk.CardsCameraActivity");
        Intent intent = RePlugin.createIntent("idcard", "com.kernal.passportreader.sdk.AllCardMainActivity");
//        Intent intent = RePlugin.createIntent("plugindemo", "com.snxun.plugindemo.MainActivity");
        if (!RePlugin.startActivity(getContext(), intent)) {
            ToastUtils.showShort(getContext(), "启动失败");
        }
    }

    public Context getContext() {
        return MainActivity.this;
    }
}