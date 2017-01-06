package com.serita.gclibrary.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by 12985 on 2017/1/6.
 */

public class T {
    public static void showShort(Context context,String str){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }
}
