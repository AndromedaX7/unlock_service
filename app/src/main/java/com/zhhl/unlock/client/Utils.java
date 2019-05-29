package com.zhhl.unlock.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;

/**
 * Created by czy on 2019/5/29 15:04.
 */
public class Utils {

    public static void ToCamera(Context context){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        context.startActivity(intent);
    }
}
