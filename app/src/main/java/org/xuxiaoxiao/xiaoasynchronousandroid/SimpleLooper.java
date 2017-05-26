package org.xuxiaoxiao.xiaoasynchronousandroid;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by WuQiang on 2017/5/26.
 */

public class SimpleLooper extends Thread {
    private Handler myHandler;

    public void run() {
        // Attach a Looper to the current Thread
        Looper.prepare();
        myHandler  =  new MyHandler();
        // Start the message processing
        Looper.loop();
    }

    public Handler getHandler(){
        return myHandler;
    }

}
