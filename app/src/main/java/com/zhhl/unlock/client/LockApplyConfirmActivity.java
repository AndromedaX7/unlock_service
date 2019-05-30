package com.zhhl.unlock.client;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.zhhl.unlock.R;

/**
 * 开锁申请确认
 * Created by czy on 2019/5/29 9:21.
 */
public class LockApplyConfirmActivity extends BaseActivity{


    private RelativeLayout back;
    private RelativeLayout submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_apply_confirm);
        setTitleStr("开锁申请");

        back = findViewById(R.id.back);
        submit = findViewById(R.id.submit);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LockApplyConfirmActivity.this,LockRegisteredActivity.class);
                startActivity(intent);
            }
        });

    }


}
