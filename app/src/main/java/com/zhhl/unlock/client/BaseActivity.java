package com.zhhl.unlock.client;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.zhhl.unlock.R;

/**
 * Created by czy on 2019/5/29 9:22.
 */
public class BaseActivity extends Activity {

    private TextView titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

    }

    protected void setTitleStr(String titleStr){
        titleView = findViewById(R.id.title);
        titleView.setText(titleStr);
    }
}
