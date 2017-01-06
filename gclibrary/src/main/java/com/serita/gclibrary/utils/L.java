package com.serita.gclibrary.utils;

import android.util.Log;

import com.serita.gclibrary.Constant;

/**
 * Created by 12985 on 2017/1/6.
 */

public class L {
    public static boolean isDebug=true;
    private static String TAG= Constant.fileName;
    public static void i(String str){
        if(isDebug)
        {
            Log.i(TAG,str);
        }
    }
}
