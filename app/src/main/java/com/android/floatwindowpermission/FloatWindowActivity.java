/*
 * Copyright (C) 2016 Facishare Technology Co., Ltd. All Rights Reserved.
 */
package com.android.floatwindowpermission;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.android.permission.AVCallFloatView;
import com.hss01248.permission.FloatWindowManager;


/**
 * Description:
 *
 * @author zhaozp
 * @since 2016-10-17
 */

public class FloatWindowActivity extends Activity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        FloatWindowManager.getInstance().askPermission(this);
        findViewById(R.id.btn_show_or_apply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              dialog =   FloatWindowManager.getInstance().showAsTypeToast(new AVCallFloatView(FloatWindowActivity.this));
            }
        });

        findViewById(R.id.btn_dismiss).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dialog !=null && dialog.isShowing()){
                    dialog.dismiss();
                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        if(dialog !=null && dialog.isShowing()){
            dialog.dismiss();
        }else {
            super.onBackPressed();
        }
    }
}
