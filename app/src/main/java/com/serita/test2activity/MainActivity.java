package com.serita.test2activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import jni.Jni;


public class MainActivity extends Activity {
    private  TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(v ->onClick());

    }
    private void onClick(){
//        tv.setText("结果:"+Jni.patch("1","2","3"));
        tv.setText("结果:");

    }
}
