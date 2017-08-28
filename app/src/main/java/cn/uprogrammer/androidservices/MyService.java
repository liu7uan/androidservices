package cn.uprogrammer.androidservices;

import android.app.Service;
import android.os.IBinder;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/22.
 */

public class MyService extends Service{
    @Override
    public  IBinder onBind(Intent arg0){
        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        //Let it continue running until it is stoped
        Toast.makeText(this,"服务器已经启动",Toast.LENGTH_LONG).show();
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"服务已经停止",Toast.LENGTH_LONG).show();
    }
}

