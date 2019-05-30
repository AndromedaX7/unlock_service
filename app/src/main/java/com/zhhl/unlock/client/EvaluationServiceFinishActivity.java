package com.zhhl.unlock.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhhl.unlock.R;

/**
 * 完成服务评价
 * Created by czy on 2019/5/30 10:03.
 */
public class EvaluationServiceFinishActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation_service_finish);
        setTitleStr("服务评价");
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(EvaluationServiceFinishActivity.this,OrderListActivity.class);
//                startActivity(intent);
                finish();
            }
        });
    }
}
