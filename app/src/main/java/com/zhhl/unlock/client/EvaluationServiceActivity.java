package com.zhhl.unlock.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhhl.unlock.R;

/**
 * 服务评价
 * Created by czy on 2019/5/29 16:37.
 */
public class EvaluationServiceActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation_service);
        setTitleStr("服务评价");
        findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EvaluationServiceActivity.this,EvaluationServiceFinishActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
