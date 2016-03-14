package com.example.somebody.tookbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by somebody on 2016/3/14.
 */
public class TopBarTest extends Activity {
    private TopBar  mTopBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topbar_text);
        mTopBar = (TopBar)findViewById(R.id.topBar);
        mTopBar.setOnTopbarClickListener(new TopBar.topbarClickListener(){
            @Override
            public void leftClick() {
                Toast.makeText(TopBarTest.this,"点击了左侧按钮",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(TopBarTest.this,"点击了右侧按钮",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
