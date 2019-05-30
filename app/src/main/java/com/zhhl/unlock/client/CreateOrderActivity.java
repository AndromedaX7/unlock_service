package com.zhhl.unlock.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhhl.unlock.R;

/**
 * 创建订单
 * Created by czy on 2019/5/29 15:24.
 */
public class CreateOrderActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_order);
        setTitleStr("创建订单");

        findViewById(R.id.pass).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateOrderActivity.this,GenerateOrdersActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateOrderActivity.this,GenerateOrdersActivity.class);
                startActivity(intent);
            }
        });

    }
}
