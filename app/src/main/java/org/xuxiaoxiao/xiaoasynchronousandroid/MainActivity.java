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

            Handler handler = new StackTraceHandler();
            Message msg = handler.obtainMessage();
            handler.sendMessage(msg);

    }
}
