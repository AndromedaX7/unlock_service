package com.zhhl.unlock.client;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zhhl.unlock.R;

/**
 * 开锁登记
 * Created by czy on 2019/5/29 11:17.
 */
public class LockRegisteredActivity extends BaseActivity implements View.OnClickListener {

    private LinearLayout location;
    private LinearLayout community;

    private TextView text1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_registered);

        setTitleStr("开锁登记");

        location = findViewById(R.id.location);
        community = findViewById(R.id.community);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        location.setOnClickListener(this);
        community.setOnClickListener(this);

        findViewById(R.id.camera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.ToCamera(LockRegisteredActivity.this);
            }
        });

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LockRegisteredActivity.this,CreateOrderActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {
        text1.setText("吉林省长春市朝阳区");
        text2.setText("一号院");
    }
}
