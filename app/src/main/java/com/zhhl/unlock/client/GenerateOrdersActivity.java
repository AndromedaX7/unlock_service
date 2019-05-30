package com.zhhl.unlock.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhhl.unlock.R;

/**
 * 生成订单
 * Created by czy on 2019/5/29 15:43.
 */
public class GenerateOrdersActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_orders);
        setTitleStr("生成订单");
        findViewById(R.id.ll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenerateOrdersActivity.this,TrackingOrderActivity.class);
                startActivity(intent);
            }
        });
    }
}
