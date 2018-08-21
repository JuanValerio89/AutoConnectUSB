package com.valerio.havr.autoconnectusb;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Handler TimeCheckUSB = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimeCheckUSB.postDelayed(TimeCheckUSB_, 1000);

    }



    Thread TimeCheckUSB_ = new Thread(new Runnable() {

        public void run() {
            Log.d("USBConnection","Thread");
            TimeCheckUSB.postDelayed(this, 2000);
            Toast.makeText(getApplicationContext(),"Check time USB",Toast.LENGTH_SHORT).show();
            
            /*

           if USB == Connect
                Open APP
             */

        }
    });
}
