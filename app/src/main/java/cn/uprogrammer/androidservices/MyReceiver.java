package cn.uprogrammer.androidservices;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/22.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context,Intent intent){
        Toast.makeText(context,"检测意图",Toast.LENGTH_LONG).show();
    }
}
