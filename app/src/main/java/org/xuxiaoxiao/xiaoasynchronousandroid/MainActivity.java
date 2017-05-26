package org.xuxiaoxiao.xiaoasynchronousandroid;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleLooper looper = new SimpleLooper();
        looper.start();
        looper.waitforStart();
        Handler handler = new StackTraceHandler(looper.getLooper());
        Message msg = handler.obtainMessage();
        handler.sendMessage(msg);
        /**
         * The interesting thing to realize here is that
         * we can send messages from the main thread to the background thread managed by SimpleLooper
         * (or even from the background thread to the main thread) and,
         * in doing so, hand over work from background threads to the main thread—for example,
         * to have it update the user interface with the results of background processing.
         */
    }
}
