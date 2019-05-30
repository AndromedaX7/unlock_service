package com.zhhl.unlock.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhhl.unlock.R;

/**
 * 跟踪订单
 * Created by czy on 2019/5/29 16:37.
 */
public class TrackingOrderActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking_order);
        setTitleStr("跟踪订单");
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrackingOrderActivity.this,OrderListActivity.class);
                startActivity(intent);
            }
        });
    }
}
