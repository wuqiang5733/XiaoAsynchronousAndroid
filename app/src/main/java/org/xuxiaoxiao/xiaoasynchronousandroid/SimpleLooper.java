package org.xuxiaoxiao.xiaoasynchronousandroid;

import android.os.Looper;

/**
 * Created by WuQiang on 2017/5/26.
 */

public class SimpleLooper extends Thread {
    // start condition
    boolean started = false;
    Object startMonitor = new Object();
    Looper threadLooper = null;

    @Override
    public void run() {
        Looper.prepare();
        // Return the Looper object associated with the current thread.
        threadLooper = Looper.myLooper();
        synchronized (startMonitor) {
            started = true;
            startMonitor.notifyAll();
        }
        Looper.loop();
    }

    Looper getLooper() {
        return threadLooper;
    }

    // Threads could wait here for the Looper start
    void waitforStart() {
        synchronized (startMonitor) {
            while (!started) {
                try {
                    startMonitor.wait(10);
                } catch (InterruptedException e) {

                }
            }
        }

    }
}
