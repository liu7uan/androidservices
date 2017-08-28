package cn.uprogrammer.androidservices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;


import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    // Method to start the service
    public void startService(View view) {
        startService(new Intent(getBaseContext(), MyService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }

    public void broadcastIntent(View view) {
        Intent intent =new Intent();
        intent.setAction("cn.uprogrammer.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
