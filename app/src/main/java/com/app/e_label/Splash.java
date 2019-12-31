package com.app.e_label;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.app.qrcodescanner.R;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        final int welcomeScren = 3000;
        Thread welcomeThread = new Thread(){
            int wait = 0;

            public void run(){

                try{
                    super.run();
                    while (wait < welcomeScren){
                        sleep(100);
                        wait+=100;
                    }
                }catch(Exception e){
                    System.out.println("Exc=" +e);
                }finally{
                    startActivity(new Intent(Splash.this, FragmentActivity.class));
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}