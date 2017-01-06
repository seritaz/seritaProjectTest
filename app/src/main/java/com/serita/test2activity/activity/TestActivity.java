package com.serita.test2activity.activity;

import android.widget.TextView;

import com.serita.gclibrary.utils.L;
import com.serita.gclibrary.utils.T;
import com.serita.test2activity.R;

/**
 * Created by 12985 on 2017/1/6.
 */

public class TestActivity extends BaseActivity {
    private TextView tv;
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
        L.i("结果:");
        T.showShort(this,"结果:");

    }
}
