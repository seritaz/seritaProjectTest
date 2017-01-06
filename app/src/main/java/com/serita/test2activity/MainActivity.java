package com.serita.test2activity;

import android.os.Bundle;
import android.widget.TextView;

import jni.Jni;


public class MainActivity extends BaseActivity {
    private  TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(v ->onClick());
    }

    @Override
    protected void initData() {

    }

    private void onClick(){
//        tv.setText("结果:"+Jni.patch("1","2","3"));
        tv.setText("结果:");

    }
}
