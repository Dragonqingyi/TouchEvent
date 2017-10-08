package com.dragonyang.touchevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * 一个测试触摸事件的小应用
 */
public class MainActivity extends AppCompatActivity {
    protected TextView behave;
    protected TextView location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        behave = findViewById(R.id.behave);
        location = findViewById(R.id.location);
    }

    //屏幕触摸事件覆写
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        switch (action){
            case MotionEvent.ACTION_UP:
                behave.setText("手指抬起");
                break;
            case MotionEvent.ACTION_DOWN:
                behave.setText("手指按下");
                break;
            case MotionEvent.ACTION_MOVE:
                behave.setText("手指滑动");
        }
        float X = event.getX();
        float Y = event.getY();
        location.setText("位置=("+X+","+Y+")");
        return true;
    }
}
