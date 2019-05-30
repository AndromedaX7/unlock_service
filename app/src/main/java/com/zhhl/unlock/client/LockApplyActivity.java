package com.zhhl.unlock.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.zhhl.unlock.R;

/**
 * 开锁申请
 * Created by czy on 2019/5/29 9:21.
 */
public class LockApplyActivity extends BaseActivity{

    private EditText name;
    private EditText idCard;
    private EditText phone;

    private RelativeLayout ocr;
    private RelativeLayout submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_apply);
        setTitleStr("开锁申请");

        name = findViewById(R.id.name);
        idCard = findViewById(R.id.id_card);
        phone = findViewById(R.id.phone);
        ocr = findViewById(R.id.ocr);
        submit = findViewById(R.id.submit);

        ocr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE); //系统常量， 启动相机的关键
                startActivityForResult(openCameraIntent, 1000); // 参数常量为自定义的request code, 在取返回结果时有用
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LockApplyActivity.this,LockApplyConfirmActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000){
            Intent intent = new Intent(LockApplyActivity.this,LockApplyConfirmActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
