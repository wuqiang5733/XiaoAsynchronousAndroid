package org.xuxiaoxiao.xiaoasynchronousandroid;

import android.os.Handler;
import android.os.Looper;
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

    /**
     * Our new constructor basically attaches the Handler to the Looper passed as an argument,
     * making the StackTraceHandler attachable to any Looper instead of the current thread's Looper.
     * @param looper
     */
    StackTraceHandler(Looper looper) {
        super(looper);
    }
}
