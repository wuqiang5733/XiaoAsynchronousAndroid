package org.xuxiaoxiao.xiaoasynchronousandroid;

import android.os.Handler;
import android.os.Message;

/**
 * Created by WuQiang on 2017/5/26.
 */

public class StackTraceHandler extends Handler {
    @Override
    public void handleMessage(Message msg) {
        // Prints the Stack Trace on the Android Log
        Thread.currentThread().dumpStack();
    }
}
